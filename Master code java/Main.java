import java.util.Scanner;

public class Main {
    public enum Season {
        WINTER, SPRING, SUMMAR, RAINY
    }

    public static void main(String[] args) {

        // data types primitive
        boolean b = true;
        char c = 's';
        byte y = 1;
        short s_ = 44;
        int i0 = 1234;
        long l = 45675446L;
        float f = 10.22f;
        double d = 10.554544d;

        final int i1 = 100; // fixed

        // operators
        int i2 = i0++; // Unary
        int i3 = i1 % i0; // Arthematic
        // float f1= 1|1 bitwise
        // == relational
        int i4 = -i3;// assigment
        // || && != logical
        // ternary ? :

        // Type conversion/narrowing/explicit
        // long to short
        double d1 = 12.3455655655d;
        float f2 = (float) d1;
        System.out.println(f2);

        // java enum
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        //Array
        double[] mylist={1.6,1.2,14.2,12.5};
        for(int i=0;i<mylist.length;i++){
            System.out.println(mylist[i]+" ");
        }
        double total=0;
        for(int i=0;i<4;i++){
            total += mylist[i];
            System.out.println("total is:"+total);
        }
        double max=mylist[0];
        for(int i=1;i<4;i++){
            if(mylist[i]>max)
            max=mylist[i];
            System.out.println("max is:"+max);
        }  

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String str=sc.nextLine();
        System.out.println("Welcome "+str);
        
    }

}
