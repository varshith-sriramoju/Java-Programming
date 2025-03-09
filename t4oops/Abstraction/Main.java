package t4oops.Abstraction;

public class Main {
    public static void main(String[] args) {
    Person p1=new Varshi();
    p1.eat();
    p1.speak();

    // Anonymous class
    // Anonymous class is a class that is declared without a name.
    //direct abstract class implementation without creating a class
    Person p2=new Person(){
    @Override
    public void eat(){
        System.out.println("eating");
    }
    };
    p2.eat();
    p2.speak();

    }

}
