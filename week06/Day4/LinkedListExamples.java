package Day4;

import java.util.Arrays;
import java.util.LinkedList;

/*
 * LIST
 *      -> are indexed and ordered
 *      -> Collections API - any class will inherit from the List class
 *      -> ONLY WORKS WITH OBJECTS
 * 
 * 
 * LINKED-LIST
 *      -> non-consecutive memory locations
 *      -> each node contains at least 1 pointer to the next node
 *      -> dont have indexes
 *      -> insertion to the front - constant time O(1)
 *              - anywhere else will be O(n)
 *      -> capacity will equal size 
 *      -> java linkedlist are always doubly linked
 * 
 */

public class LinkedListExamples {

    public static void main(String[] args) {
        
        LinkedList<String> fruits = new LinkedList<>();
        System.out.println(fruits);

    /*
     * Add elements to the list
     */    
        fruits.add("apples");
        fruits.add("durian");
        fruits.add("Snake fruit");
        fruits.add("Star fruit");
        fruits.add("kiwano");

        System.out.println(fruits);

        fruits.add( 1, "pears");
        System.out.println(fruits);

        fruits.addLast("papaya");
        fruits.addLast("papaya");
        System.out.println(fruits);

    /*
     * Remove elements from the list
     */
        //removes the first ocurence of apples
        fruits.remove("apples");
        System.out.println(fruits);

        //removes all occurences of papaya and pears from list
        fruits.removeAll(Arrays.asList("pears", "papaya"));
        fruits.removeAll(Arrays.asList("fruit")); // wont remove anything, has to match element 
        System.out.println(fruits);

        //removes fruit at index 2
        String fruit = fruits.remove(2);
        System.out.println("Fruit removed was " + fruit);
        System.out.println(fruits);

        fruits.add(2, fruit);
        fruits.addFirst(fruit);
        System.out.println(fruits);

        fruits.removeLastOccurrence(fruit);
        System.out.println(fruits);

        System.out.println(fruits.indexOf(fruit));

    }
    
}
