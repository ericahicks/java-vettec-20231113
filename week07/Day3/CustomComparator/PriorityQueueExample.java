package Day3.CustomComparator;

import java.util.Comparator;
import java.util.PriorityQueue;

//Create custom Comparator for our PriorityQueue
public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Task> todos = new PriorityQueue<>(new TaskComparator());
        todos.offer(new Task("Study"));
        todos.offer(new Task("Clean the dishes")); //2
        todos.offer(new Task("Do the laundry"));
        todos.offer(new Task("Clean the bedroom")); //2
        todos.offer(new Task("Clean the car")); //2
        System.out.println("\nPrioritizing todo:");
        while(!todos.isEmpty()) {
            System.out.println(todos.poll().name);
        }
    }
    
}

class Task {
    String name;

    public Task(String name) {
        this.name = name;
    }
}

//Custom Comparator
class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        if(o1.name.contains("clean"))
            return 2;
        return 1;
    }
}
