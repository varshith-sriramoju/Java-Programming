package t4oops.polymorphisam;

//polymorphisam is the ability of an object to take on many forms
public class Main {
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.feature();

        /*nokia is a phone but phone is not nokia as there's also iphone */
        Phone p2;
        p2=new Nokia3310();
        p2.feature();

        Phone p3;
        p3=new Iphone();
        p3.feature();
    }
}
