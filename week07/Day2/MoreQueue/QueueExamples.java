package Day2.MoreQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();
        customers.add("Bobby");
        customers.add("Sally");
        customers.add("Jim Bob");

        customers.offer("Sally Sue"); // pretty much the same as add

        System.out.println(customers);
        //System.out.println(customers.get(2)); //Queue is not an indexed data type
        System.out.println(((LinkedList<String>) customers).get(2)); //type casting

        /*
         * Dont use type casting, if you find yourself using type casting, then you probably
         * shouldn't be implementing a queue data structure in the first place 
         */

    }
    
}
