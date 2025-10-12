package t8Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> Q =new LinkedList<>();
        //Queue Interface is implemen Linkedlist
        Q.offer(1);
        Q.offer(2);
        Q.offer(3);
        System.out.println(Q);
        System.out.println(Q.poll()); //remove First
        System.out.println(Q);
        System.out.println(Q.peek());
        Q.add(2);
        System.out.println(Q.element());
        //offer poll peek
    }
}
