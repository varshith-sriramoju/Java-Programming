package Decision;

public class _9Nested {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){ //changes 1  2  3  4 .....
            for(int j=1;j<=10;j++){ //constant 1 to 10
                for(int k=1;k<=10;k++){
                    System.out.println("Value of i :"+i+" and j is "+j+" also k is "+k);
                }
            }
           System.out.println("**************");
        }
         
    }
    
}
