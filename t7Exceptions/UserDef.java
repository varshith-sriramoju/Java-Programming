package t7Exceptions;

public class UserDef {
    public static void main(String[] args) {
        ThrowThrows tt=new ThrowThrows();
        tt.doSth();
    }

    class ZeroException extends Exception{

    }

}
