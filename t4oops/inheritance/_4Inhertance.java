package t4oops.inheritance;
/*no inheritance of private */
public class _4Inhertance {
    public static void main(String[] args){
    car c1=new car();
    c1.fuelTank=4;
    System.out.println(c1.fuelTank);
    Bike b1=new Bike("long");
    System.out.println(b1.getHandle());
    System.out.println(b1.getEngine());
    }
}
