package InterviewPrograms;
//153 → 1³ + 5³ + 3³ = 153
public class Amstrong {
    public static void main(String[] args) {
        int num=153,sum=0,temp=num;
    while(temp!=0){
        int digit=num%10;
        sum+=Math.pow(digit, 3);
        temp/=10;
    }
    if(num==sum){
        System.out.println("Armstrong is ");
    }else{
        System.out.println("not");
    }

    }
}
