package t8Collections;
import java.lang.reflect.Array;
import java.util.*;
public class arrayClass {
    public static void main(String[] args) {
        Integer[] num={1,2,3,4,5,6,7,8,9};
        //search
        int index=Arrays.binarySearch(num, 6);//returns index
        System.out.println(index);

        //sort
        Integer[] num1={5,7,6,7,1,5,9,4};
        Arrays.sort(num1);
        // print elements space-separated
        for (int i : num1) {
            System.out.print(i + " ");
        }

    }
}
