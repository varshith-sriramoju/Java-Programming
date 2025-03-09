package t4oops.Abstraction;

/*
 * abstration means hiding the implementation details and showing only
 *  the essential features of the object.
 * In java, abstraction is achieved by abstract classes and interfaces.
 * An abstract class is a class that is declared with abstract keyword.
 * An abstract class may or may not have abstract methods.
 * If a class has an abstract method, then the class must be declared as abstract.
 * An abstract class can have constructors, member variables and normal methods.
 * An abstract class can have data member, abstract method, method body (non-abstract method),
 *  constructor, and even main() method.
 * A method defined in an abstract class can be abstract or non-abstract.
 * An abstract class can extend another Java class and implement Java interfaces.
 */
public abstract class Person {
    public void speak(){
        System.out.println("Welcome to the world of Abstraction");
    }
    public abstract void eat();
}
