package finalCode;
//scanner class module

import java.util.Scanner;

//Buffer reader module
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FirstBasic {
    public static void main(String[] args) throws IOException {

        //3 number swap
        int a = 3, b = 4, c = 5, temp;
        System.out.println("before swapping a=" + a + " b=" + b + " c=" + c);
        temp = b;
        b = a;
        a = c;
        c = temp;
        System.out.println("before swapping a=" + a + " b=" + b + " c=" + c);

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter s1:");
        String s1=sc.next();
        System.out.println("s1 is "+s1);

        System.out.print("enter i:");
        int i=sc.nextInt();
        System.out.println("i is "+i);

        System.out.print("enter s2:");
        String s2=bf.readLine();
        System.out.println("s2 is "+s2);

        System.out.print("enter i1:");
        int i1=Integer.parseInt(bf.readLine());
        System.out.println("i1 is "+i1);

        int i3=10;
        System.out.format("the integer value is %d",3);

    }
}
