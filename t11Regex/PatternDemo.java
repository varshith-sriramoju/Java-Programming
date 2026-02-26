package t11Regex;
import java.util.regex.*;
public class PatternDemo{
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("geeks.*");
        Matcher m1=p1.matcher("geeksforgeeks");
        System.out.println(m1.find());
        System.out.println(Pattern.matches("\\d{4}", "1234"));
        System.out.println(Pattern.matches("\\d{4}", "12345"));
        Pattern p2=Pattern.compile("\\s+");
        String[] parts=p2.split("one   two\tthree");
        for(String s:parts){
            System.out.println(s);
        }
        


    }
}