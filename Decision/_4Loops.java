/*to get  */
package Decision;

public class _4Loops {
    public static void main(String[] args) {
        for(int i=10;i>=1;i--){ // 10 to 1
        System.out.println(i);
    }
    for(int i = 1;i<=10;i++){
        System.out.println(i); // 1 to 10
    }

    int j=10;
    for(; ; j--){
        System.out.println(j);
        if(j>=1){ 
            break; //10
        }
    }


    }
    
}
