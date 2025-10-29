package InterviewPrograms;
//0 1 1 2 3 .........
public class Fibonocci {
    public static void main(String[] args) {
        //by not recursion
        int n1=0,n2=1,n3,count=10;
        System.out.print(n1+" "+n2);
        for(int i=2;i<=count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
        System.out.println("----------------------");
        for(int i=0;i<=count;i++){
            System.out.print(fibbo(i)+" ");
        }
    }
    //by recursion
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }else{
            return fibbo(n-1)+fibbo(n-2);
        }
    }
}
