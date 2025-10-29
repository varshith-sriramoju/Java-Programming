package InterviewPrograms;

public class SwapNum {
    public static void main(String[] args) {
        int a=1,b=2;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

        int c=1245;
        String str=String.valueOf(c);
        System.out.println(str.length());
    }

}
