package t3javamethods;
public class _4PrimeNumber{
    public static void main(String[] args){
    int num = 7;
    int temp;
    for(int i=2;i<num/2;i++){
        temp=num%2;
        if(temp!=0){
            System.out.println("Prime");
            break;
        }
        else{
            System.out.println("Not Prime");
            break;
        }
    }
    
    }
}
