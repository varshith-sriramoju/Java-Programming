/* 
import java.util.*;

public class _2Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        // int b = sc.nextInt(); 
    
        // if(a==b){
        //     System.out.print("Equal");
        // }
        // else if(a>b){
        //     System.out.print("a is greater");
        // }
        // else {
        //     System.out.print("A is lesser");
        switch (a) {
            case 1:
                System.out.print("Hello");
                break;
            case 2:
                System.out.print("Namaste");
                break;
            case 3:
                System.out.print("Bonjour");
            default:
                System.out.print("Get out");
                break;
        }
        }
} */

import java.util.*;

class _2Ques {
    public static void main(String[] args) {
        System.out.print("enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String oper = sc.next();
        if (oper == "+") {
            System.out.println("Addition is:", a + b);
        }
    }
}
