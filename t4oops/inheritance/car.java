package t4oops.inheritance;
public class car extends _4Vechile{
    public String Fridge;
    public String enter;
    public car(int wheels, int seats, int fuelTank, String engine, int lights, String fridge, String enter) {
        super(wheels, seats, fuelTank, engine, lights);
        Fridge = fridge;
        this.enter = enter;
    }

    
}
