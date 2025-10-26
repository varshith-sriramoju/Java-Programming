package t7Exceptions;

class ExcTest extends Exception{
    static void getexception(){
        int num[]=new int[4];
        System.out.println("before exception");
        num[7]=10;
        System.out.println("not executed");
    }
}
public class _8ThrowableMethods {
    public static void main(String[] args) {
        try{
            ExcTest.getexception();
        }
        catch (ArrayIndexOutOfBoundsException ao){
            System.out.println("standard message is ");
            System.out.println(ao);

            System.out.println("stack trace");
            ao.printStackTrace();

            System.out.println("returns description of message");
            ao.getMessage();

            System.out.println("return string object");
            System.out.println(ao.toString());

            System.out.println("complete stack tree");
            ao.fillInStackTrace();

            System.out.println("localized description of message");
            ao.getLocalizedMessage();


        }
    }
}
