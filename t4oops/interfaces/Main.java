package t4oops.interfaces;

//no private, protected, default interface only public
//interface means abstract class with all methods abstract by default
//interface can have only abstract methods
//interface can have only public static final variables
//interfece defination is public abstract
//the difference between interface and abstract class is that
//interface can have only abstract methods and
//abstract class can have abstract and non abstract methods
//abstract class can have constructors but interface can't have constructors
//abstarct methods means methods without
public class Main {
    public static void main(String[] args) {
        SamPhone s1=new SamPhone();
        String p=s1.processor();
        System.out.println(p);
        System.out.println("Phone interface:-"+s1.spaceinGB());
        System.out.println("Android interface:-"+s1.googlePlay());

        IPhone i1=new IPhone();
        String p1=i1.processor();
        System.out.println(p1);
        System.out.println("Phone interface:-"+i1.spaceinGB());
        System.out.println("IOS interface:-"+i1.airDrop());
    }
}