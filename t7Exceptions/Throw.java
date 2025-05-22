package t7Exceptions;

public class Throw {
    public static void main(String[] args) {
        try{
            System.out.println("before handling");
            throw new ArithmeticException("throw exception");
            //now not intreupted as it is handled in the catch block
        }
        catch(ArithmeticException ae){
            System.out.println("something");
        }
        System.out.println("----------------------------------------------------------------------------");
        throw new ArithmeticException("exception thrown");
        // no code after this line will be executed because the exception is thrown
    }
}
