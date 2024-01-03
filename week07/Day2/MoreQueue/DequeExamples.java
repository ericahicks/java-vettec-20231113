package Day2.MoreQueue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExamples {
    public static void main(String[] args) {
        Deque<String> line = new LinkedList<>();
        line.add("Sean");
        line.add("Caroline");
        System.out.println(line);

        line.addFirst("Hunter");
        line.addLast("Carlos");

        line.offer("Steven"); //queue method, adds a name to the back of the queue
        System.out.println(line);

        line.poll(); //queue method, removes a name from the front on the queue
        System.out.println(line);
        line.pollLast();
        System.out.println(line);

        System.out.println(line.peek()); //queue method, looks at the front 
        System.out.println(line.peekFirst()); //look to the front of the queue
        System.out.println(line.peekLast()); //look to the back of the queue
    }
    
}
