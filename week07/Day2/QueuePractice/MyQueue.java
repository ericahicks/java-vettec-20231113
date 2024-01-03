package Day2.QueuePractice;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    /*
     * Stacks vs Queues
     * 
     * Stacks are "Last in, first Out"
     *  - new items pushed to the stack go to the front
     * 
     * Queues are "First in, First Out"
     *  - new items added to the queue go to the back of the queue and wait until they get to the front
     * 
     * For queues, just think of them as a line
     * 
     * Real life examples of queues:
     *  - standing in line at a grocery store
     *  - waiting for a representative on the phone
     *  - queuing up a song at a bar
     *  - Josh's gaming backlog
     *  - Milk jugs at a groceryt store, the newest one goes to the back, and the oldest goes to the front
     * 
     * Queues are perfect for when you want to handle "tasks" or "items" sequentially, one at a time
     * 
     * There's also a "Dequeue" (pronounced Deck), which stands for Double ended queue
     * 
     * 
     * 
     * Three key methods/fucntions for a queue
     * 
     * 1. Peek() -> same as the stack's peek, but returns a value of the front, if empty returns null
     * 2. Poll() -> same as the stack's pop, but removes from the front
     * 3. Add() -> same as the stack's push, but adds to the back 
     * 
     * 4. element() -> same as the peek for queue, but will throw an exception if the queue is empty
     * 
     */

    
    private Node<T> front;
    private Node<T> back;
    private int size;

    public MyQueue() { }

    public void add(T value) {
        Node<T> newBack = new Node<>(value);
        //if there is already a back
        if(back != null) {
            //if yes, have the old back point to the new node (newBack)
            back.setPrev(newBack);
        }
        newBack.setNext(back);
        back = newBack;
        //allows us to "create" a head
        if(front == null) {
            front = newBack;
        }
        size++;
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }
        return front.getValue();
    }

    public T poll() {
        if(isEmpty()) {
            throw new NoSuchElementException("Can NOT remove an element from an empty queue!");
        }
        T value = front.getValue();
        if(!front.hasPrev()) {
            back = null;
            front = null;
        }
        else {
            front = front.getPrev();
            front.setNext(null);
        }
        size--; //decrement size due to removing element 
        return value;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> currNode = front; //starting with the front of the queue and print the whole queue without removing anything
        while(currNode != null) {
            str += currNode.getValue(); //add the value stored in that node to our string

            //if there's no next, that means it's the final element in our stack, so no comma
            if(currNode.hasPrev()) { 
                //if there's a next node in the sequence, add a coma
                str += ",";
            }

            //Advance our pointer
            currNode = currNode.getPrev(); //it changes out pointer from one node to that node's neghbooring node
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {
        MyQueue<City> cityQueue = new MyQueue<>();

        //System.out.println(cityQueue.size() + " " + cityQueue);

        cityQueue.add(new City("Atlanta"));
        cityQueue.add(new City("Pittsburg"));
        cityQueue.add(new City("Jacksonville"));

        System.out.println(cityQueue.size() + " " + cityQueue);

        System.out.println(cityQueue.peek());
        cityQueue.poll();
        System.out.println(cityQueue.peek());
        System.out.println(cityQueue.size() + " " + cityQueue);

        cityQueue.poll();
        cityQueue.poll();
        cityQueue.poll();

        System.out.println(cityQueue.size() + " " + cityQueue);
        System.out.println(cityQueue.peek());

        try {
            cityQueue.poll(); //the size is 0, therefore empty
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("you can NOT poll an empty queue!");
        }
    }

    
}
