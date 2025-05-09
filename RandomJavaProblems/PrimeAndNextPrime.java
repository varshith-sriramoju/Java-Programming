package RandomJavaProblems;
import java.util.Scanner;

public class PrimeAndNextPrime {
    public static void main(String[] args) {
        isPrime(2);
    }

    public static boolean isPrime(int num){
        if(num==2 || num==3){
            return true;
        }
        int temp;
        for(int i=2;i<=num/2;i++){
            temp=num%2;
            if(temp!=0){
                return true;
            }
            else {
                return false;
            }
        }
        return true;
//        int nextprime(){
//            if(num==true)
//        }

    }
}
