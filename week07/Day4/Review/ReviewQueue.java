package Day4.Review;

import java.util.LinkedList;
import java.util.Queue;

public class ReviewQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> queue1 = new LinkedList<>();
        queue.add("dog");
        queue.add("cat");
        queue.add("pony");
        queue.offer("monkey");
        queue.add("tiger");
        queue.add("elephant");

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue1.peek());
    }
    
}
