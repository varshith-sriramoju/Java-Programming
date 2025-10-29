package t7Exceptions;
import java.io.IOException;
public class _6Throwss {
    public static void main(String[] args) {
        char ch;
        try{
            ch=exception('k');
        }
        catch (IOException exe){
            System.out.println("please enter single char value");
            System.out.println(exe);
            ch='X';
        }
        System.out.println("you entered: "+ch);
    }
    public static char exception(char str) throws IOException{
        System.out.println(str);
        return (char) System.in.read();
    }

}
