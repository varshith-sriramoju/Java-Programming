package t4oops;
/*
 * public class: class that can be accessed from any other class
 * private: access modifier, restricts access to the class
 * protected: access modifier, restricts access to the package and subclasses
 * default: access modifier, restricts access to the package
 */
public class _1Car {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    /*
     * this keyword is used to refer to the current object
     */
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
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
    
    public String run(){
        if(doors.equals("closed")&&engine.equals("on") && driver.equals("seated")&&speed>0){
            return "running";
        }
        else{
            return "not running";
        }
    }
}
