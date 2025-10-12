package t8Collections;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        Map<String,Integer> num=new HashMap<>();
        //TreeMap is in sort order
        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);
        //unique keys only
        num.put("Two", 4);
        System.out.println(num);
        num.putIfAbsent("four", 4);

        for(Map.Entry<String,Integer> e:num.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key:num.keySet()){
            System.out.println(key);
        }

        System.out.println(num.containsValue(3));
        System.out.println(num.containsKey("Two"));

    }
}
