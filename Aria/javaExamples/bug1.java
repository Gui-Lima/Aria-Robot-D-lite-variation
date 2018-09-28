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

    static int passo = 200;
    static char[][] mapa = new char[10000][10000];
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
                    mapa[5000 + f + (int) (sonar.getYTaken() / passo)][5000 + j + (int) (sonar.getXTaken() / passo)] = '.';
                }
            } else {
                for (int j = -1; j > x; j--) {
                    f = (int) (aux * j);
                    mapa[5000 + f + (int) (sonar.getYTaken() / passo)][5000 + j + (int) (sonar.getXTaken() / passo)] = '.';
                }
            }
        } else {
            double aux = x / (double) (y);
            if (y > 0) {
                for (int j = 1; j < y; j++) {
                    f = (int) (aux * j);
                    mapa[5000 + j + (int) (sonar.getYTaken() / passo)][5000 + f + (int) (sonar.getXTaken() / passo)] = '.';
                }
            } else {
                for (int j = -1; j > y; j--) {
                    f = (int) (aux * j);
                    mapa[5000 + j + (int) (sonar.getYTaken() / passo)][5000 + f + (int) (sonar.getXTaken() / passo)] = '.';
                }
            }
        }
        if (sonar.getRange() < 5000) {
            mapa[5000 + (int) (sonar.getY() / passo)][5000 + (int) (sonar.getX() / passo)] = '#';
        }
        mapa[prevPosy][prevPosx] = '.';
        mapa[5000 + (int) (sonar.getYTaken() / passo)][5000 + (int) (sonar.getXTaken() / passo)] = 'R';
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
    

    public static void main(String[] argv) {
        System.out.println("Starting TangBug Algorithm");

        // Inicializando o Aria
        Aria.init();
        ArRobot robot = new ArRobot();
        ArSimpleConnector conn = new ArSimpleConnector(argv);

        //Ajustando coordenadas do robô para coordenadas globais
        prevPosx = Integer.parseInt(argv[0]);
        prevPosy = Integer.parseInt(argv[1]);
        prevPosth = Integer.parseInt(argv[2]);
        robot.moveTo(new ArPose(Integer.parseInt(argv[0]), Integer.parseInt(argv[1]), Integer.parseInt(argv[2])));

        // Posição final do robo
        int finalX = Integer.parseInt(argv[3]);
        int finalY = Integer.parseInt(argv[4]);
        ArPose goal = new ArPose(finalX, finalY);

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

        moveLeft(robot,3);
        moveUp(robot,8);
        moveRight(robot,1);
        moveDown(robot,20);

        wait(robot);
        robot.stopRunning(true);
        robot.disconnect();

        ArUtil.sleep(100);
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(mapa[4990 + i][4990 + j]);
            }
            System.out.println("");
        }

        Aria.exit(0);

    }
}
