package finalCode;
import java.util.Scanner;
public class SecondBasic {
    public static void main(String[] args) {
        System.out.println("even or odd");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to check: ");
        long a= sc.nextLong();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        System.out.println("last number");
        System.out.print("enter a number:");
        int b=sc.nextInt();
        int lasNum=b%10;
        System.out.println(lasNum);

        System.out.println("last second number");
        System.out.print("enter a number:");
        int c=sc.nextInt();
        int lasNum1=c%100;
        System.out.println(lasNum);

        System.out.println("leap year:");
        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("then its leap year");
        }
        else{
            System.out.println("not leap year");
        }

        System.out.println(year+" "+a);


    }
}
