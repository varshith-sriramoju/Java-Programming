package InterviewPrograms;
//153 → 1³ + 5³ + 3³ = 153
public class Amstrong {
    public static void main(String[] args) {
        int num=153,sum=0,temp=num;
        String len=Integer.toString(num);
        int l=len.length();

    while(temp!=0){
        int digit=temp%10;
        sum+=Math.pow(digit, l);
        temp/=10;
    }
    if(num==sum){
        System.out.println("Armstrong is ");
    }else{
        System.out.println("not");
    }

    }
}
