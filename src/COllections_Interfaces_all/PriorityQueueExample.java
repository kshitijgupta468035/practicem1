package COllections_Interfaces_all;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(23);
        queue.add(12);
        queue.add(123);
        queue.add(1234);

        System.out.println(queue);

        queue.remove(12);


        System.out.println(queue.peek());

        System.out.println(queue.size());

        queue.add(12334);
        System.out.println(queue);


    }
}
