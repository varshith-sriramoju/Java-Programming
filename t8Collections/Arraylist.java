package t8Collections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
            List<Integer> l1 =new ArrayList();//also work with Linkedlist
            l1.add(1);
            //dynamically increased at n+n/2+1 initally 10
            l1.add(2);
            l1.add(3);
            l1.add(4);
            System.out.println(l1);
            l1.add(5);
            System.out.println(l1);
            l1.add(2,50);
            System.out.println(l1);

            List<Integer> l2=new ArrayList();
            l2.add(10);
            l2.add(13);
            System.out.println(l2);
            l1.addAll(l2);
            System.out.println(l1);

            System.out.println(l1.get(1)); //print
            System.out.println(l1.get(0));

            l1.remove(3);
            l1.remove(Integer.valueOf(50));

            l1.set(4,400); //add at part loc

            l1.contains(50); //bool

            for(int i=0;i<l1.size();i++){
                System.out.println("the element is:"+l1.get(i));
            }

            //similar to looping
            Iterator it=l1.iterator();
            while (it.hasNext()){
                System.out.println("iterator "+it.next());
            }

            //l1.clear();

    }

}
