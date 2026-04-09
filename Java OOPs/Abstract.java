abstract class Animal{
    abstract public void walk();
}
class Horse extends Animal{
    public void walk(){
     System.out.println("walks on 4 legs");
    }
} 
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }

}
public class Abstract {
    public static void main(String[] args) {
        Horse H1 = new Horse();
    H1.walk();
    }
}
