package t7Exceptions;

public class _1TryCatch {
    public static void main(String[] args) {
        int y=0,x;
        try{
            System.out.println("Before exception");
            x=(y=10*10)/0;
            System.out.println("The divide by 0 exception"+10/0); // this will throw an exception
            System.out.println("After Exception"); //will not be executed
        }
 //among all catch blocks, the first one that matches the exception will be executed and others will be ignored
        catch (ArithmeticException e){
            System.out.println("Arithmatic Eception:"+e);
           // e.printStackTrace(); //exact line where exception is
        }
        catch (Exception a){
            System.out.println("exception"+a);
        }
        finally { //always executed
            System.out.println(y);
        }
    }
}
