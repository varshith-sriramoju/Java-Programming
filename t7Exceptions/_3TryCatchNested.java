package t7Exceptions;

public class _3TryCatchNested {
    public static void main(String[] args) {
        int numerator[]={4,8,16,32,64,128,222,555};
        int denominator[]={2,0,4,0,0,8};
        try{
           for(int i=0;i<numerator.length;i++) {
               try { //used to arthi then if it reached i=6 then it will crash
                   System.out.println(numerator[i] + "/" + denominator[i] + " gives " + numerator[i] / denominator[i]);
               }
               catch (ArithmeticException ae){
                   System.out.println("cant divide by zero");
               }
           }
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("no matching element found");
            System.out.println("fatal program terminated");
        }
    }
}
