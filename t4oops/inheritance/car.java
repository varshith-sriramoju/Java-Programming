package t4oops.inheritance;
public class car extends _4Vechile{
    public String fridge;
    public String enter;

    public car(){
        super();
        this.fridge=fridge;
        this.enter=enter;
    }
    public car(int wheels, int seats, int fuelTank, String engine, String lights, String fridge, String enter) {
        super(wheels, seats, fuelTank, engine, lights);
        this.fridge = fridge;
        this.enter = enter;
    }

    
}
