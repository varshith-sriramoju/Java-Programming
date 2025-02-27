package t4oops.inheritance;
/*no inheritance of private */
public class _4Inhertance {
    public static void main(String[] args){
    car c1=new car();
    car c2=new car(4,4,4,"petrol","LED","yes","yes");
    c2.fuelTank=5;
    c1.fuelTank=5;
    System.out.println(c2.fuelTank);
    System.out.println(c1.fuelTank);

    Bike b1=new Bike("long");
    Bike b2=new Bike(2,2,2,"petrol","led","short");
    System.out.println(b1.getHandle());
    System.out.println(b1.getEngine());
    System.out.println(b2.getEngine());
    System.out.println(b2.getHandle());
    }
}
