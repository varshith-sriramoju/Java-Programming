package InterviewPrograms;
//5:1*2*3*4*5

public class Factorial {
    public static void main(String[] args) {
        //no recursion
        int n=5;
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.printf("factorial of %d is %d\n",n,fact);
        System.out.println("-----------------------------");
        System.out.println(factorial(5));
    }
    //recursion
    static long factorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
