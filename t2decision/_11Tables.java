package t2decision;

public class _11Tables {
    public static void main(String[] args) {
        //2 ,3 ,4  table upto 10 times
        for(int i=2;i<=4;i++){
            System.out.println("now "+i+"th table");
            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            
        }
    }
}
