public class _4Vechile {
    public int wheels;
    public int seats;
    public int fuelTank;
    public String engine;
    public int lights;

    public _4Vechile(){
        this.engine="petrol";
        this.wheels="4";
        this.seats="4";
        this.fuelTank="35";
        this.lights="LED";
    }

    public _4Vechile(int wheels, int seats, int fuelTank, String engine, int lights) {
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

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    } 
    
}
