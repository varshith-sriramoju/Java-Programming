package t7Exceptions;

class ReThrow{
    public static void genException(){
        int numerator[]={4,8,16,32,64,128,222,555};
        int denominator[]={2,0,4,0,0,8};
        for(int i=0;i<=numerator.length;i++) {
            try {
                System.out.println(numerator[i] + "/" + denominator[i] + "=" + numerator[i] / denominator[i]);

            } catch (ArithmeticException ae) {
                System.out.println("cant divide number by 0");
            } catch (ArrayIndexOutOfBoundsException ao) {
                System.out.println("ntg to divide");
                throw ao; //rethrowing the exception means the exception is not caught in the genException method
                //stops thier
            }
        }
    }
}
public class Retthrow {
    public static void main(String[] args) {
        try{
            ReThrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("main exception"); //this exception is caught in the main method which stopped by throw
        }

    }
}
