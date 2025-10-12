package t4oops.Practice;

public class Base{
    public static void main(String[] args){
        Person p1=new Person();
        p1.age=22;
        p1.name="Varshith";
        p1.eat();
        p1.walk();
        System.out.println(p1.name+" has "+p1.age+" age");
        p1.walk(100);
        System.out.println(Person.count);

        Person p2=new Person(25,"Varsh");
        p2.walk(150);

        Developer d1=new Developer(24, "Sriram");
        d1.walk(50);

        Laaptop l1= new Laaptop();
        l1.setRam(20);
        System.out.println(l1.getRam());

        BMW M5 =new BMW();
        M5.start();
    }
}


class Person{
    String name;
    int age;
    //static is used for object independent variable or method
    static int count;

    // default constructor
    public Person(){
        count++;
        System.out.println("creating an obj");
    }

    //parameterized constructor
    public Person(int age,String name){
        //this is for current instance variable
        this();
        this.name=name;
        this.age=age;
    }

    //method overloading
    void walk(){
        System.out.println("just walk");
    }
    //compile-time polymorphism or method overloading
    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }
    void eat(){
        System.out.println("Just eat");
    }
    void doWork(){

    }
}

//Inheritance
class Developer extends Person{
    public Developer(int age,String name){
        //super() is used to call parent class constructor
        super(age,name);
    }
    //method overriding or runtime polymorphism
    void walk(int steps){
        System.out.println("developer walked "+steps);
    }
}
