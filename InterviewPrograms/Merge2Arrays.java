package InterviewPrograms;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] b={2,4,6};
        int[] merged=new int[a.length+b.length];
        System.arraycopy(a, 0, merged, 0,a.length);
        //arraycopy(sourceArray, sourceStartIndex, destinationArray, destinationStartIndex, numberOfElementsToCopy)
        System.arraycopy(b, 0, merged, a.length, b.length);
        System.out.println("Merged array:"+Arrays.toString(merged));
    }
}
