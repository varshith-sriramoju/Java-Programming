public class hello {
    public static void main(String[] args){
    _1Car car=new _1Car();
    car.setSpeed(10);
    car.setEngine("on");
    car.setDoors("closed");
    car.setDriver("seated");
    System.out.println(car.getEngine());
    System.out.println(car.getSpeed());
    System.out.println(car.getDoors());
    System.out.println(car.getDriver());
    System.out.println(car.run());
    }
}
