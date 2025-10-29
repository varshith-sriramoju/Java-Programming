package t7Exceptions;

public class _7ThrowThrows {
    public static void main(String[] args) {
        _7ThrowThrows tt=new _7ThrowThrows();
        // try{
        // tt.doSth();}
        // catch(RuntimeException re){
        //     System.out.println("errrrror");
        // }
        tt.doSth();

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
