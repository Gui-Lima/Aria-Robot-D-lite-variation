import com.mobilerobots.Aria.*;
import java.util.ArrayList;
import java.util.Collections;

public class bug1 {
    public static final String KNRM = "\u001B[0m";
    public static final String KRED = "\u001B[31m";
    public static final String KGRN = "\u001B[32m";
    public static final String KYEL = "\u001B[33m";
    public static final String KBLU = "\u001B[34m";
    public static final String KMAG = "\u001B[35m";
    public static final String KCYN = "\u001B[36m";
    public static final String KWHT = "\u001B[37m";

    static int passo = 300;
    static int mapsize = 250;
    static char[][] mapa = new char[mapsize][mapsize];
    static int[][] dist = new int[mapsize][mapsize];
    static int prevPosx,prevPosy,prevPosth;
    static ArPose prevPos;
    static ArrayList<Par> buffer = new ArrayList<Par>();
    static boolean[][] correction = new boolean[mapsize][mapsize];


    // Carrega a biblioteca que precisa para rodar
    static {
        try {
            System.loadLibrary("AriaJava");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library libAriaJava failed to load. Make sure that its directory is in your library path; See javaExamples/README.txt and the chapter on Dynamic Linking Problems in the SWIG Java documentation (http://www.swig.org) for help.\n" + e);
            System.exit(1);
        }
    }

    // Checa se você mandou argumentos pro Aria
    public static boolean checkParseArgs() {
        if (!Aria.parseArgs()) {
            Aria.logOptions();
            Aria.exit(1);
            return false;
        }
        return true;
    }

    public static void inicializarMatriz() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                mapa[i][j] = '?';
            }
        }
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                dist[i][j] = 999;
            }
        }
    }


    // Conecta o robo para mandar os comandos
    public static boolean connect(ArSimpleConnector conn, ArRobot robot) {
        if (!conn.connectRobot(robot)) {
            System.err.println("Could not connect to robot, exiting.\n");
            System.exit(1);
            return false;
        }
        return true;
    }

    public static void putInMapa(ArSensorReading sonar) {
        int x = (int) ((sonar.getX() - sonar.getXTaken()) / passo);
        int y = (int) ((sonar.getY() - sonar.getYTaken()) / passo);
        int f;

        if (Math.abs(y) < Math.abs(x)) {
            double aux = y / (double) (x);
            if (x > 0) {
                for (int j = 1; j < x; j++) {
                    f = (int) (aux * j);
                    mapa[(mapsize/2) + f + (int) (sonar.getYTaken() / passo)][(mapsize/2) + j + (int) (sonar.getXTaken() / passo)] = '.';
                }
            } else {
                for (int j = -1; j > x; j--) {
                    f = (int) (aux * j);
                    mapa[(mapsize/2) + f + (int) (sonar.getYTaken() / passo)][(mapsize/2) + j + (int) (sonar.getXTaken() / passo)] = '.';
                }
            }
        } else {
            double aux = x / (double) (y);
            if (y > 0) {
                for (int j = 1; j < y; j++) {
                    f = (int) (aux * j);
                    mapa[(mapsize/2) + j + (int) (sonar.getYTaken() / passo)][(mapsize/2) + f + (int) (sonar.getXTaken() / passo)] = '.';
                }
            } else {
                for (int j = -1; j > y; j--) {
                    f = (int) (aux * j);
                    mapa[(mapsize/2) + j + (int) (sonar.getYTaken() / passo)][(mapsize/2) + f + (int) (sonar.getXTaken() / passo)] = '.';
                }
            }
        }
        if (sonar.getRange() < 5000) {
            mapa[(mapsize/2) + (int) (sonar.getY() / passo)][(mapsize/2) + (int) (sonar.getX() / passo)] = '#';
        }
        mapa[prevPosy][prevPosx] = '.';
        prevPosx = (int) (sonar.getXTaken() / passo);
        prevPosy = (int) (sonar.getYTaken() / passo);
        mapa[(mapsize/2) + (int) (sonar.getYTaken() / passo)][(mapsize/2) + (int) (sonar.getXTaken() / passo)] = 'R';
    }

    public static void sonnarMap(ArRobot robot) {
        for (int i = 0; i < robot.getNumSonar(); i++) {
            ArSensorReading sonar = robot.getSonarReading(i);
            putInMapa(sonar);
        }
    }


    public static void wander(ArRobot robot, ArPose pose) {
        robot.lock();
        robot.setHeading(robot.findAngleTo(pose));
        robot.unlock();
        wait(robot);

        robot.lock();
        robot.move(robot.findDistanceTo(pose));
        robot.unlock();
        wait(robot);
    }

    // Utility function not not keep sleeping everytime
    public static void wait(ArRobot robot) {
        ArUtil.sleep(500);
        while (!robot.isStopped()) {
            ArUtil.sleep(500);
        }
        return;
    }

    public static void moveRight(ArRobot robot, int i){
        wander(robot, new ArPose(((int)(robot.getX()/passo)+i)*passo, robot.getY()));
    }
    public static void moveLeft(ArRobot robot, int i){
        wander(robot, new ArPose(((int)(robot.getX()/passo)-i)*passo, robot.getY()));
    }
    public static void moveUp(ArRobot robot, int i){
        wander(robot, new ArPose(robot.getX(), (((int)(robot.getY()/passo)+i)*passo)+(int)robot.getRobotRadius()));
    }
    public static void moveDown(ArRobot robot, int i){
        wander(robot, new ArPose(robot.getX(), (((int)(robot.getY()/passo)-i)*passo)+(int)robot.getRobotRadius()));
    }

    public static void fillMap(int x, int y,int xf, int yf){
        boolean isEnd = false;
        if(x == xf && y == yf){
            dist[xf][yf] = 0;
            isEnd = true;
        }
        int up = 99999; int right = 99999; int down = 99999; int left = 99999;
        int self = dist[x][y];
        boolean hasup = true; boolean hasright = true; boolean hasdown = true; boolean hasleft = true;
        if(x==0){hasleft = false;}
        if(x==mapsize-1){hasright = false;}
        if(y==0){hasup = false;}
        if(y==mapsize-1){hasdown = false;}

        if(hasup && dist[x][y-1] != -1){
            up = dist[x][y-1];
        }if(hasright && dist[x+1][y] != -1){
            right = dist[x+1][y];
        }if(hasdown && dist[x][y+1] != -1){
            down = dist[x][y+1];
        }if(hasleft && dist[x-1][y] != -1){
            left = dist[x-1][y];
        }

        if(!isEnd) {
            int min = Math.min(up, Math.min(right, Math.min(down, Math.min(left, self))));
            dist[x][y] = min + 1;
            self = min + 1;
        }

        if(hasup){
            if (dist[x][y-1]>self && dist[x][y-1]!=-1) {
                buffer.add(new Par(x, y-1));
            }
        }if(hasright){
            if (dist[x+1][y]>self && dist[x+1][y]!=-1) {
                int[] toAdd = new int[2];
                buffer.add(new Par(x+1, y));
            }
        }if(hasdown){
            if (dist[x][y+1]>self && dist[x][y+1]!=-1) {
                buffer.add(new Par(x, y+1));
            }
        }if(hasleft){
            if (dist[x-1][y]>self && dist[x-1][y]!=-1) {
                buffer.add(new Par(x-1, y));
            }
        }
    }

    public static void update(ArRobot robot, int x, int y){
        for(int i=0;i<mapsize;i++){
            for (int j=0;j<mapsize;j++){
                dist[i][j] = 99999;
                if(mapa[j][i] == '#'){
                    dist[i][j] = -1;
                }
                if(correction[i][j]){
                    dist[i][j] = -1;
                }
            }
        }
        System.out.println("is it tois?");
        Par next;
        buffer.add(new Par(x,y));
        int t = 0;
        while(!buffer.isEmpty()){
            next = buffer.remove(0);
            buffer.removeAll(Collections.singleton(next));
            if(t%500==0)
                ArUtil.sleep(1);
            t++;
            fillMap(next.x,next.y,x,y);
        }
        System.out.println("e tois");
//        System.out.println("adada");
//        for(int i=0;i<20;i++){
//            for (int j=0;j<20;j++){
//                System.out.print(String.format("%05d ", dist[125+j][120+i]));
//            }
//            System.out.println();
//        }
//        System.out.println("-");
    }

    public static int go(ArRobot robot){
        robot.lock();
        int x = (int)(robot.getX()/passo) + (mapsize/2);
        int y = (int)(robot.getY()/passo) + (mapsize/2);
        robot.unlock();
        int up = 99999; int right = 99999; int down = 99999; int left = 99999;
        boolean hasup = true; boolean hasright = true; boolean hasdown = true; boolean hasleft = true;
        if(x==0){hasleft = false;}
        if(x==mapsize-1){hasright = false;}
        if(y==0){hasup = false;}
        if(y==mapsize-1){hasdown = false;}
        if(hasup && dist[x][y+1] != -1){
            up = dist[x][y+1];
        }if(hasright && dist[x+1][y] != -1){
            right = dist[x+1][y];
        }if(hasdown && dist[x][y-1] != -1){
            down = dist[x][y-1];
        }if(hasleft && dist[x-1][y] != -1){
            left = dist[x-1][y];
        }
        int min = Math.min(up, Math.min(right, Math.min(down, left)));
        System.out.println(KYEL + min + KNRM);
        System.out.println("up:"+up+" right:"+right+" down:"+down+" left:"+left);
        if(min==up){
            int a = 0;
            while(dist[x][y-a] == dist[x][y-a-1]+1){
                a++;
            }
            System.out.println("up " + a);
            moveUp(robot,a);
            wait(robot);
            return 1;
        }else if(min==right){
            int a = 0;
            while(dist[x+a][y] == dist[x+a+1][y]+1){
                a++;
            }
            System.out.println("right " + a);
            moveRight(robot, a);
            wait(robot);
            return 2;
        }else if(min==down){
            int a = 0;
            while(dist[x][y+a] == dist[x][y+a+1]+1){
                a++;
            }
            System.out.println("down " + a);
            moveDown(robot, a);
            wait(robot);
            return 3;
        }else if(min==left){
            int a = 0;
            while(dist[x-a][y] == dist[x-a-1][y]+1){
                a++;
            }
            System.out.println("left " + a);
            moveLeft(robot,a);
            wait(robot);
            return 4;
        }
        return -1;
    }


    public static void main(String[] argv) {
        System.out.println("Starting TangBug Algorithm");

        // Inicializando o Aria
        Aria.init();
        ArRobot robot = new ArRobot();
        ArSimpleConnector conn = new ArSimpleConnector(argv);

        //Ajustando coordenadas do robô para coordenadas globais
        prevPosx = Integer.parseInt(argv[0])/passo;
        prevPosy = Integer.parseInt(argv[1])/passo;
        prevPosth = Integer.parseInt(argv[2]);
        robot.moveTo(new ArPose(Integer.parseInt(argv[0]), Integer.parseInt(argv[1]), Integer.parseInt(argv[2])));

        // Posição final do robo
        int finalX = Integer.parseInt(argv[3]);
        int finalY = Integer.parseInt(argv[4]);
        ArPose goal = new ArPose(finalX, finalY);
        int goalMapx = (int) (Integer.parseInt(argv[3])/passo) + (mapsize/2);
        int goalMapy = (int) (Integer.parseInt(argv[4])/passo) + (mapsize/2);

        // Checa os args passados e a conexão
        if ((!checkParseArgs()) || !connect(conn, robot)) {
            return;
        }

        // Inicializa os sensores
        inicializarMatriz();
        ArSonarDevice sonar = new ArSonarDevice();
        robot.addRangeDevice(sonar);
        ArBumpers bumpers = new ArBumpers();
        robot.addRangeDevice(bumpers);


        // Algoritmo do robo
        /* ------------------------------------------ CODAR AQUI ------------------------------ */
        robot.runAsync(true);
        robot.lock();
        robot.enableMotors();
        robot.unlock();
        new Thread(() -> {
            while (true) {
                sonnarMap(robot);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        robot.setHeading(180);
        wait(robot);
        update(robot, goalMapx, goalMapy);
        while (((int)(robot.getX()/passo) + (mapsize/2))!=goalMapx && ((int)(robot.getY()/passo) + (mapsize/2))!=goalMapy){
            int initx = ((int)(robot.getX()/passo) + (mapsize/2));
            int inity = ((int)(robot.getY()/passo) + (mapsize/2));
            int dir = go(robot);
            wait(robot);
            if (((int)(robot.getX()/passo) + (mapsize/2))==initx && ((int)(robot.getY()/passo) + (mapsize/2))==inity){
                robot.move(-passo);
                wait(robot);
                robot.setHeading(180);
                wait(robot);
                if(dir==1){
                    //correction[initx][inity] = true;
                    correction[initx][inity-1] = true;
                }else if(dir==2){
                    //correction[initx][inity] = true;
                    correction[initx+1][inity] = true;
                }else if(dir==3){
                    //correction[initx][inity] = true;
                    correction[initx][inity+1] = true;
                }else if(dir==4){
                    //correction[initx][inity] = true;
                    correction[initx-1][inity] = true;
                }
                update(robot, goalMapx, goalMapy);
            }
            for(int i=0;i<20;i++){
                for (int j=0;j<20;j++){
                    if((int)(robot.getX()/passo) + (mapsize/2) == 125+j && (int)(robot.getY()/passo) + (mapsize/2) == 120+i){
                        System.out.print(KCYN + "RRR " + KNRM);
                    }else if(dist[125 + j][120 + i] == -1){
                        System.out.print(KRED + String.format("%03d ", dist[125 + j][120 + i]) + KNRM);
                    }else {
                        System.out.print(String.format("%03d ", dist[125 + j][120 + i]));
                    }
                }
                System.out.println();
            }
            System.out.println("-");
        }

        moveRight(robot, 50);
        wait(robot);

        System.out.println(goalMapx+" , "+goalMapy);

        wait(robot);
        update(robot, goalMapx, goalMapy);
        robot.stopRunning(true);
        robot.disconnect();

        System.out.println("adada");
        for(int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                if(dist[125 + j][120 + i] == -1){
                    System.out.print(KRED + String.format("%05d ", dist[125 + j][120 + i]) + KNRM);
                }else {
                    System.out.print(String.format("%05d ", dist[125 + j][120 + i]));
                }
            }
            System.out.println();
        }
        System.out.println("-");

        Aria.exit(0);

    }
}

class Par{
    public int x;
    public int y;

    public Par(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean pequals (Par p){
        if(this.x == p.x && this.y == p.y){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals (Object o){
        if (o instanceof Par){
            return this.pequals((Par) o);
        }else{
            return false;
        }
    }
}