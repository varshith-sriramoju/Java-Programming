package t8Collections;
import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        //now max heap due to comparator
        pq.offer(100);
        pq.offer(34);
        pq.offer(24);
        pq.offer(2);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
