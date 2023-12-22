package Day4;

import java.util.LinkedList;

public class LinkedListReview {

    /*
     * ArraysLists
     * - stored sequentially, contiguosly in memory
     * - indexed for item lookup (fast)
     * - resizing arrays is costly
     * 
     * LinkedLists solve the shortcomings of Arraylists
     * - not stored contiguously 
     * - no random/direct access
     * - no resizing is necessary at all
     * 
     * LinkedLists are comprised of Nodes
     * - These nodes contain pertinant data such as 
     *   the value contained at an index, any meta data, and most importantly, the link to the next element in the list
     * - a null value for the next indicates the end of the list (NO where left to go)
     * - all we need to traverse a LinkedList is the head node or the first element, then a pointer to the next element in the chain
     * 
     * LinkedList Pros:
     * - adding to the front is not as expensive as an ArrayList
     *     - it's immediate to add to the front or the tail (doubly linked list, both the head and the tail)
     * - dynamic memory, no need to resize like Arrays 
     * - is NOT store contiguously, it is typically easier to store data if memory is an issue
     * - deleting elements is the same as adding, typically very quick
     * - No such thing as resizing, to add beyond the length of the list, you still have to go through tho whole list 
     *      - just add to the end of the list and have the old tail point to it
     * 
     * LinkedList Cons:
     * -  getting a value at the specific index takes longer 
     *      - we must traverse through the entire chain/list before getting to the index we care about
     * - changing the value at a specific index is slower 
     * 
     * 
     */

    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<>(); 
        System.out.println("Initial size of Linked List is: " + myLinkedList.size());
        myLinkedList.add("Saugat");
        System.out.println("Initial size of Linked List is: " + myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.add("Shawn");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.indexOf("Shawn"));
        myLinkedList.add(1, "Hunter");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.indexOf("Hunter"));

        System.out.println(myLinkedList.get(3));

        
    }
    
}
