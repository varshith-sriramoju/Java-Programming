package t7Exceptions;

class NonIntNumberException extends Exception{
    int numerator,denominator;
    NonIntNumberException(int n,int d){
        this.numerator=n;
        this.denominator=d;
    }
    public String toString(){
        return "the numerator "+numerator+" dividing denominator "+denominator+" is non integer";
    }
}
public class _4SubclassException {
    public static void main(String[] args) {
        int numerator[]={4,8,16,32,64,128,222,555};
        int denominator[]={2,0,4,0,0,8};
        for(int i=1;i<numerator.length;i++){
            try{
                if(numerator[i]%2!=0) {
                  throw new NonIntNumberException(numerator[i], denominator[i]);
                }
                System.out.println(numerator[i]+"/"+denominator[i]+" is "+numerator[i]/denominator[i]);
            }
            catch(ArithmeticException ae){
                System.out.println("no div by zero");
            }
            catch (ArrayIndexOutOfBoundsException ao) {
                System.out.println("no limit");
            }
            catch (NonIntNumberException nn){
                System.out.println("sth");
            }
        }
    }
}
