package InterviewPrograms;

public class Palimdrome {
    public static void main(String[] args) {
         int num=1221,x=num,rev=0;
         while (num!=0) {
            int lastdigit=num%10;//% to get last digit
            rev=(rev*10)+lastdigit;
            num=num/10;// / to del last digit
         }
         if(x==rev){
            System.out.println("palimdrome");
         }else{
            System.out.println("not palimdrome");
         }
    }
}
