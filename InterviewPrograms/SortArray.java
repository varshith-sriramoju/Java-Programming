package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 6, 7, 1, 13, 2};
        // Use Integer[] so we can pass a Comparator (built-in reverseOrder)
        Arrays.sort(arr); // ascending
        System.out.println("Ascending order:"+Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder()); // built-in descending
        System.out.println("Descending order:"+Arrays.toString(arr));


        int[] asc = arr.clone();
        sortAscending(asc);
        System.out.println("Ascending order:" + Arrays.toString(asc));

        int[] desc = arr.clone();
        sortDescending(desc);
        System.out.println("Descending order:" + Arrays.toString(desc));
    }

    // User-defined ascending sort (selection sort)
    static void sortAscending(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            swap(a, i, minIdx);
        }
    }

    // User-defined descending sort: reuse ascending then reverse
    static void sortDescending(int[] a) {
        sortAscending(a);
        reverseInPlace(a);
    }

    static void reverseInPlace(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            swap(a, i, j);
        }
    }

    static void swap(int[] a, int i, int j) {
        if (i == j) return;
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
