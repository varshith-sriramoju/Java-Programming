public class _2Prob {
    public static void main(String[] args) {
    AreRec(2,2);
    double Area=A2(3,4);
    System.out.println(Area); 
    //or
    System.out.println(A2(12,12));
    }
    public static void AreRec(double length,double breath){
    System.out.println(length*breath);
    }
    public static double A2(double l,double b){
    return l*b;
    }
}
