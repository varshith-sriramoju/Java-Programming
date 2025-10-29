package InterviewPrograms;
import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        HashSet<Integer> nodup=new HashSet<>();
        for(int i:arr){
            nodup.add(i);
        }
        System.out.println(nodup);
    }

}
