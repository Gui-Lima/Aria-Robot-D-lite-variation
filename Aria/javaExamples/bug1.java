import com.mobilerobots.Aria.*;

public class bug1 {
    public static final String KNRM = "\u001B[0";
    public static final String KRED = "\u001B[31m";
    public static final String KGRN = "\u001B[32m";
    public static final String KYEL = "\u001B[33m";
    public static final String KBLU = "\u001B[34m";
    public static final String KMAG = "\u001B[35m";
    public static final String KCYN = "\u001B[36m";
    public static final String KWHT = "\u001B[37m";

    static int passo = 300;
    static int mapsize = 1000;
    static char[][] mapa = new char[mapsize][mapsize];
    static int[][] dist = new int[mapsize][mapsize];
    static int prevPosx,prevPosy,prevPosth;
    static ArPose prevPos;


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

    public static void moveLeft(ArRobot robot, int i){
        wander(robot, new ArPose(((int)(robot.getX()/passo)+i)*passo, robot.getY()));
    }
    public static void moveRight(ArRobot robot, int i){
        wander(robot, new ArPose(((int)(robot.getX()/passo)-i)*passo, robot.getY()));
    }
    public static void moveUp(ArRobot robot, int i){
        wander(robot, new ArPose(robot.getX(), ((int)(robot.getY()/passo)+i)*passo));
    }
    public static void moveDown(ArRobot robot, int i){
        wander(robot, new ArPose(robot.getX(), ((int)(robot.getY()/passo)-i)*passo));
    }

    public static int fillMap(int x, int y,int xf, int yf){
        if(x == xf && y == yf){
            dist[xf][yf] = 0;
            return 0+1;
        }
        int up = 999; int right = 999; int down = 999; int left = 999;
        int self = dist[x][y];
        boolean hasup = true; boolean hasright = true; boolean hasdown = true; boolean hasleft = true;
        if(x==0){hasleft = false;}
        if(x==mapsize-1){hasright = false;}
        if(y==0){hasup = false;}
        if(y==mapsize-1){hasdown = false;}

        if(hasup){
            up = fillMap(x, y-1, xf, yf);
        }if(hasright){
            right = fillMap(x+1, y, xf, yf);
        }if(hasdown){
            down = fillMap(x, y+1, xf, yf);
        }if(hasleft){
            left = fillMap(x-1, y, xf, yf);
        }

        int min = Math.min(up, Math.min(right, Math.min(down, Math.min(left, self))));
        dist[x][y] = min;
        return min + 1;
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
        int goalMapx = (int) (Integer.parseInt(argv[3])/passo);
        int goalMapy = (int) (Integer.parseInt(argv[4])/passo);

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


        ArActionStallRecover recover = new ArActionStallRecover();
        robot.addAction(recover, 200);

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
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        moveLeft(robot,2);

        wait(robot);
        robot.stopRunning(true);
        robot.disconnect();

//        fillMap(20,20,150,150);
//        System.out.println("adada");
//        for(int i=0;i<1000;i++){
//            for (int j=0;j<1000;j++){
//                System.out.print(String.format("%04d ", dist[j][i]));
//            }
//            System.out.println();
//        }

//        ArUtil.sleep(100);
//        for (int i = 0; i < 50; i++) {
//            for (int j = 0; j < 50; j++) {
//                System.out.print(mapa[mapsize/2 - 25 + i][mapsize/2 - 15 + j]);
//            }
//            System.out.println("");
//        }

        Aria.exit(0);

    }
}
