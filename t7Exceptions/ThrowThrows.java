package t7Exceptions;

public class ThrowThrows {
    public static void main(String[] args) {
        ThrowThrows tt=new ThrowThrows();
        try{
        tt.doSth();}
        finally {
            System.out.println("sth");
        }
    }
    //throws means that the method may throw an exception like try catch means that the method is handled
    //throw means that the method will throw an exception means it is not handled
    public void doSth() throws RuntimeException{
        String x="Zero";
        if(x.equals("Zero")){
            throw new RuntimeException("som exception");
        }
        System.out.println("DO something");
    }
}
