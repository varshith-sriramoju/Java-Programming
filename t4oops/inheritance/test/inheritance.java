package t4oops.inheritance.test;

public class inheritance {
    public static void main(String[] args) {
        Reptile r1=new Reptile();
        System.out.println(r1.showInfo());
        Reptile r2=new Reptile(5, 10, "Reptile", "Cold", "Dry", true, "Soft");
        System.out.println(r2.showInfo());
    }
}
