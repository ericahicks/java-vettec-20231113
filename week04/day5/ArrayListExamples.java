import java.util.ArrayList;

public class ArrayListExamples {

    /*
     * Review Arrays
     * 
     * ARRAY
     *      -> A data structure for holding multiple value contiguously in memory
     * 
     *      -> Fixed sized 
     * 
     *      -> Elemnts are accessible using the index starting 0 
     * 
     *      -> Values must be homogenous (of the same data type)
     * 
     *      -> Stored on Heap in sequential order
     */
    public static void main(String[] args) {

        String[] names = new String[3]; // array with 3 spots allocated but no real values
        String[] names2 = {"Nick", "Josh", "Saugat"}; //creates an array with 3 filled memory locations

        System.out.println(names);  //prints out starting address which is index 0
        System.out.println(names[1]);  //prints the value at index 0
        System.out.println(names2[2]);  //prints the value at index 2

        /*
         * ARRAY LISTS
         *      -> dynamic array - grows as you add more data to it
         * 
         *      -> Values must be homogenous
         * 
         *      -> CANNOT store primitive data types 
         * 
         *      -> has useful methods to make life easier (add, remove, removeAll, etc.)
         * 
         *      -> starting capacity is 10, unles you say otherwise
         *          - capacity is number of elements it CAN hold currently
         *          - size is the number of elements it IS holfing currently
         *      -> once is full, it will grow by 50%
         *                  10 -> 15 -> 23 etc.
         * 
         *      -> are indexed and ordered
         * 
         *      -> ONLY WORK WITH OBJECTS
         *          - java gives you Wrapper class for primitive data types
         *          - Wrapper class wraps around a primitive data type and converts it to an object
         *                  int -> Integer
         *                  double -> Double 
         *                  etc. 
         * 
         *      -> Collections API in Java - inherits from the List class
         *          - must import java.util.ArrayList;
         * 
         */

        ArrayList<String> fruits = new ArrayList<>();

        /*
         * to insert an element into an array list use add()
         */
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("peach");
        fruits.add("pineapples");
        fruits.add("durian");

        System.out.println(fruits);

        fruits.add(0, "banana");  // inserts at a specific index

        System.out.println(fruits);

        System.out.println(fruits.size());

        /*
         * to access an element in our array list we use get()
         */
        String item1 = fruits.get(0); //returns the value at index 0
        String item2 = fruits.get(4); //returns the value at index 4
        System.out.println(item1);
        System.out.println(item2);

        /*
         * to access the index of a certain element use indexOf()
         */
        int indexOfDurian = fruits.indexOf("durian"); //returns the index location of "durian"
        System.out.println(indexOfDurian);

        /*
         * to remove a certain element from a list use remove()
         */
        fruits.remove(0); //removes element from index location
        System.out.println(fruits);

        fruits.remove("durian"); //removes specified object from array list
        System.out.println(fruits);

        /*
         * we can override elements with the set()
         */
        fruits.add("raspberries");
        fruits.set(0, "blueberries");
        System.out.println(fruits);

        fruits.removeAll(fruits);
        System.out.println(fruits);



        /*
         * Review Questions
         * 
         * 1. will the following code compile?
         *      ArrayList<int> numbers = new ArrayList<>(); BAD
         *      ArrayList<Integer> numbers = new ArrayList<>(); GOOD
         * 
         * 2. What class do ArrayLists inherit from?
         *      List class
         * 
         * 3. what's the starting capacity of an ArrayList?
         *      10
         * 
         */





        
    }
    
}
