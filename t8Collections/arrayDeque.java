package t8Collections;
import java.util.*;
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(1);
        adq.offerLast(100);
        System.out.println(adq);
        adq.offer(12);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        //poll()-remove
        System.out.println(adq.poll());
        System.out.println("poll:"+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst:"+adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast:"+adq);

    }
}
