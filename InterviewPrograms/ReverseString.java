package InterviewPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str="varshi";
        StringBuilder reversed=new StringBuilder(str).reverse();
        System.out.println(reversed);
        /*class:mutable, growable seq of char for effi build
         * and manipul strings without creating new string
         */

         System.out.println("-----------------------------");
         System.out.println(revStr("varshi"));
    }
    //alternative
    static String revStr(String str){
        StringBuilder rev = new StringBuilder(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}
