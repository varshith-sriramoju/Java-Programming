package t8Collections;
import java.util.*;
public class collectionClass {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(2);
        li.add(1);
        System.out.println("min ele:"+Collections.min(li));
        System.out.println("max ele:"+Collections.max(li));
        System.out.println(Collections.frequency(li, 5));
    }
}
