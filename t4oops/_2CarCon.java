package t4oops;
/*constructor:same as class
 * Super() called constructor of parent class
 */
public class _2CarCon {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public _2CarCon() { //default constructor
        doors="opened";
        engine="off";
        driver="seated";
        speed=10;
    }
  
    /*if custom constructor created then no default constructor */
    //parameterized constructor or custom constructor
    public _2CarCon(String doors, String engine, String driver, int speed) { 
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String run() { 
        if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
            return "running";
        } else {
            return "not running";
        }
    }
}
