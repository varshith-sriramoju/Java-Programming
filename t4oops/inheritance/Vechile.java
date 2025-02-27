package t4oops.inheritance;
public class Vechile {
    public int wheels;
    public int seats;
    public int fuelTank;
    public String engine;
    public String lights;

    //constructor overloading
    //default constructor
    public Vechile(){
        this.engine="petrol";
        this.wheels=4;
        this.seats=4;
        this.fuelTank=35;
        this.lights="LED";
    }
    //parameterized constructor(custome constructor)
    public Vechile(int wheels, int seats, int fuelTank, String engine, String lights) {
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.lights = lights;

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getLights() {
        return lights;
    }

    public void setLights(String lights) {
        this.lights = lights;
    } 

    public String toString(){
        return "Vechile{"+
        "wheels="+wheels+
        ", seats="+seats+
        ", fuelTank="+fuelTank+
        ", engine="+engine+
        ",lights="+lights+
        "}";
}
public String run(){
    return "vechile is running";
}
    
}
