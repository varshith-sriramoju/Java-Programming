package t4oops.inheritance;
public class Bike extends _4Vechile{
    public String handle;

    /*
     * super() is used to call the constructor of the parent class.
     * If super() is not used, the default constructor of the parent class is called.
     * If super() is used, the constructor with the matching parameters is called.
     * super() should be the first statement in the constructor.
     * super() can be used only in constructors.
     * super() is used to call the constructor of the parent class.
     */

     //constructor overloading
    public Bike() {
        super();
        this.handle = "short";
    }
    public Bike(int wheels, int seats, int fuelTank, String engine, String lights,String handle) {
        super(wheels, seats, fuelTank, engine, lights);
        this.handle = "short";
    }
    public Bike(String handle) {
        super(2, 1, 1, "petrol", "LED"); // Default values for wheels, seats, fuelTank, engine, lights
        this.handle = handle;
    }

    public void setHandle(String handle){
        this.handle = handle;
    }
    public String getHandle() {
        return handle;
    }

     
}
