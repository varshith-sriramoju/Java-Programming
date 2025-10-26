package t7Exceptions;

public class _2TryCatch1 {
    public static void main(String[] args) {
        int numerator[]={4,8,16,32,64,128,222,555};
        int denominator[]={2,0,4,0,0,8};
        for (int i=0;i<=numerator.length;i++){
            try {
                System.out.println(numerator[i] + "/" + denominator[i] + " gives " + numerator[i] / denominator[i]);
            }
            catch (ArithmeticException ae){
                System.out.print(" cant divide by zero");
                System.out.println(" "+ae);//give original exception statement
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.print("no match found to divide");
                System.out.println(a);
            }
            catch (Throwable t){ //recommanded to write as the code may have to handled with different exception
                System.out.println("this is superclass and executes of all above catch blocks fails and it catchs all exceptions except 2");
            }
        }
    }
}
