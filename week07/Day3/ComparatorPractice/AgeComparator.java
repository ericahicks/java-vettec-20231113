package Day3.ComparatorPractice;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    /*
     * Comparator is an interface that allows the comparison of 2 of the same objects (in this case Person)
     * 
     * Difference between Comparator and Comparable
     *  - Comparator takes two objects and compares them
     *  - Comparable compares themselves with another object
     * 
     * - With Comparator, you can define multiple compare methods per class
     * - With Comparable, you can only have 1 compareTo method per class
     * 
     * - I can make an object Comparable if it implements Comparable Interface
     * - With Comparator I can take a non comparabe object and add a comparison mechanism 
     * 
     * Pros of Comparator
     * 1. you can have multiple compare methods per class
     * 2. If you dont have direct access to the source code (did not write the class), you can NOT make it comparable, 
     *    but you can WRITE a comparator for it
     * 
     */

    /*
     * The compare method uses -1, 0, or 1 in reagrds to the person 1 (p1)
     * Negative number means that p1 < p2
     * positive numebr means that p1 > p2
     * 0 means there p1 == p2
     */ 

    @Override 
    public int compare(Person p1, Person p2) {
        // Calculating the age difference
        // If the age difference is negative then p1 is younger than p2
        // If the age difference is positive then p1 is older than p2
        //7 - 13 = negative number
        //5 - 5 = 0

        //return p1.getAge() - p2.getAge();

        //The same as above
        if(p1.getAge() == p2.getAge()) {
            return 0;
        } else if(p1.getAge() < p2.getAge()) {
            return -1;
        }
        else {
            return 1;
        }
    }  
    
}
