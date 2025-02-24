package t2decision;

public class _7loops {
    public static void main(String[] args) {
      /*   for(int i=1,j=1;i<10 || j<10;i++,j++){
        System.out.println("i="+i+" and j="+j);
        } */


      /*   int i=1,j=1;
        while(i<10 || j<10){
            i++;
            j++;
            System.out.println("i="+i+" and j="+j);
        }  */

        int i=1,j=1;
        do{
            i++;
            j++;
            System.out.println("i="+i+" and j="+j);}
            while(i<10 || j<10);
        
    for(i=1;i<10;i++){
        if(i==6){
            continue;
        }
        System.out.println(i);
    }


    }
}

/*
 * Break:-stop or terminates loop
 *        ->use to stop there so declare after 
 * 
 * 
 * continue:-skip or terminate spl iteration
 *        ->use to skip spl so declare before
 */
