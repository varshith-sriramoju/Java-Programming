
class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Write Something");
    }

    public void printcolour() {
        System.out.println(this.colour); // which called the fun
    }
}

class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPs {
    public static void main(String[] args) {
        // About pens
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "Gel";
        pen1.write();
        Pen pen2 = new Pen();
        pen2.colour = "black";
        pen2.type = "Ball";
        pen1.printcolour();
        pen2.printcolour();

        // About students
        Student s1 = new Student();// Student() is constructor i.e constructing objs from class
        s1.name = "Varsh";
        s1.age = 19;
        s1.printinfo();
    }

}