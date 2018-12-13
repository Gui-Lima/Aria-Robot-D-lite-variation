import com.mobilerobots.Aria.*;

public class TantBug {

  enum tile {
      WALL
  };

  // Carrega a biblioteca que precisa para rodar
  static {
    try {
        System.loadLibrary("AriaJava");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library libAriaJava failed to load. Make sure that its directory is in your library path; See javaExamples/README.txt and the chapter on Dynamic Linking Problems in the SWIG Java documentation (http://www.swig.org) for help.\n" + e);
      System.exit(1);
    }
  }

  public static void getCenterXY(ArRobot robot){

      return;
  }

  // Pega a posição do robo
  public static void getPose(ArRobot robot){
    System.out.println("Robot coords: robot.getX()=" +
    robot.getX() + ", robot.getY()=" + robot.getY() +
     ", robot.getTh()=" + robot.getTh());
  }

  // Utility function not not keep sleeping everytime
  public static void wait(ArRobot robot){
    ArUtil.sleep(500);
    while(!robot.isStopped()){
      ArUtil.sleep(500);
    }
    return;
  }

  // Checa se você mandou argumentos pro Aria
  public static boolean checkParseArgs(){
      if(!Aria.parseArgs()){
        Aria.logOptions();
        Aria.exit(1);
        return false;
      }
      return true;
  }

  // Conecta o robo para mandar os comandos
  public static boolean connect(ArSimpleConnector conn, ArRobot robot){
      if (!conn.connectRobot(robot)){
        System.err.println("Could not connect to robot, exiting.\n");
        System.exit(1);
        return false;
      }
    return true;
  }


  public static void sonnarMap(ArRobot robot){
    double x = robot.getX();
    double y = -robot.getY();

    for(int i =0;i<robot.getNumSonar();i++){
      ArSensorReading sonar = robot.getSonarReading(i);
      long distance = sonar.getRange();
      System.out.println(i +": "+ sonar.getX());
      System.out.println(i +": "+ sonar.getY());
      double theta = (robot.getTh() + sonar.getSensorTh());

    }
  }



  public static void main(String[] argv) {
    System.out.println("Starting TangBug Algorithm");

    // Posição final do robo
    int finalX = Integer.parseInt(argv[0]);
    int finalY = Integer.parseInt(argv[1]);



    // Inicializando o Aria
    Aria.init();
    ArRobot robot = new ArRobot();
    ArSimpleConnector conn = new ArSimpleConnector(argv);

    // Checa os args passados e a conexão
    if((!checkParseArgs()) || !connect(conn, robot)){
      return;
    }

    // Inicializa os sensores
    ArSonarDevice sonar = new ArSonarDevice();
    robot.addRangeDevice(sonar);
    ArBumpers bumpers = new ArBumpers();
    robot.addRangeDevice(bumpers);


    ArActionStallRecover recover = new ArActionStallRecover();
    robot.addAction(recover, 100);

    // Algoritmo do robo
    /* ------------------------------------------ CODAR AQUI ------------------------------ */
    robot.runAsync(true);

    robot.lock();
    robot.enableMotors();
    robot.move(1000);
    robot.unlock();
    wait(robot);
    robot.lock();
    ArSensorReading sonarr = robot.getSonarReading(0);
    System.out.println("x: "+ sonarr.getX());
    System.out.println("y: "+ sonarr.getY());
    robot.unlock();
    System.out.println("roboX: " + robot.getX());
    System.out.println("roboY: " + robot.getY());

    wait(robot);
    robot.lock();
    robot.stopRunning(true);
    robot.disconnect();
    robot.unlock();
    Aria.exit(0);
  }
}
