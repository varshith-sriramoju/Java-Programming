package t4oops.Practice;

//multiple inheritance using interfaces
public class Base2 implements Vechile,Man {
    public static void main(String[] args) {

    }
    private void doWork(){
        System.out.println("do some work");
    }

    @Override
    public void start(){
        System.out.println("somehting");
    }
    @Override
    public void walk(){
        System.out.println("walking");
    }
}

//Encapsulation
class Laaptop{
    private int ram;
    public void setRam(int ram){
        boolean isAdmin=true;
        if(!isAdmin){
            System.out.println("You cannot set");
        }
        else{
            this.ram=ram;
        }
    }
    public int getRam(){
        return ram;
    }
}

//Abstraction
abstract class Car {
    int price;
    //abstract method are defaultly public and must be overridden in derived class
    abstract void start();
}
class BMW extends Car{
    //overriding is used in runtime polymorphism abstraction
    @Override
    void start(){
       System.out.println("BMW is starting");
    }
}
class Benz extends Car{
    @Override
    void start(){
        System.out.println("Benz is starting");
    }
}

interface Vechile {
    void start();
}
interface Man{
    void walk();
}