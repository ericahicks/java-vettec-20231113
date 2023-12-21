package Day3.Generics;

import java.util.ArrayList;
import java.util.List;

/*
 * GENERICS
 *      -> allows for code reusability
 *      -> use angle brackets <T>
 *      -> doesn't work with primitive data types
 *          - must use Wrapper class
 *      -> eliminates the need to cast
 * 
 *      -> Bounded Generics
 *          - gives your bound a limit on what Types can be passed in
 *          - can extend classes
 *                  Printer <T extends Animal>
 * 
 *          - can implement interfaces, must use the extends keyword
 *                  Printer <T extends Interface>
 * 
 *          - can extend a class and multiple interfaces, class must be first
 *                  restrictions:
 *                      - can only extend 1 class, java doesnt supprt multiple inheritance
 *                      - must give class name first and any interfaces after it
 *                  Printer <T extends Animal & Interface1 & Interface2>
 * 
 *      -> Generic Methods
 *          - use angle brackets <T>
 *          - generic method can be created in regular classes - don't need to be generic
 *          - can take in mulitple parameters 
 *                  private static <T, V> void shout(T thingToShout, V otherThingToShout) { }
 * 
 *      -> Wildcards
 *          - used when the type is unkown
 *          - <?>
 *                  private static void printList(List<?> myList) 
 * 
 */

public class GenericsExamples {
    public static void main(String[] args) {

    /*
     * Uses individual classes - redundant 
     */
        IntegerPrinter printer = new IntegerPrinter(16);
        printer.print();

        DoublePrinter doublePrinter = new DoublePrinter(30.5);
        doublePrinter.print();

        StringPrinter stringPrinter = new StringPrinter("Howdy!");
        stringPrinter.print();

    /*
     * Uses Generic Printer class
     */    
        //Printer<Integer> genericIntegerPrinter = new Printer<>(3);
        //Printer<int> genericIntegerPrinter = new Printer<>(3); //BAD - no primitive data types
        //genericIntegerPrinter.print();

        //Printer<Double> genericDoublePrinter = new Printer<>(99.9);
        //genericDoublePrinter.print();

        //Printer<String> genericStringPrinter = new Printer<>("Whats up!");
        //Printer<String> genericStringPrinter = new Printer<>(6); //BAD - value needs to match data type
        //genericStringPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.print();

        //invoke shout() and print out !!!!!
        shout("Josh", "");
        shout(3, 3.5);
        shout(new Dog(), "Sean");


        List<Integer> intList = new ArrayList<>();
        intList.add(7);
        intList.add(2);
        intList.add(1);
        //invokes printList() and prints out list of integers
        printList(intList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());
        //invokes printList() and prints out list of Dogs
        printList(dogList);
        
    }

    //Generic Method
    //private static <T> void shout(T thingToShout, T otherThingToShout)
    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
            System.out.println(thingToShout + "!!!!!!");
            System.out.println(otherThingToShout + "!!!!!!");
    }

    //Method using wildcard
    //private static void printList(List<Object> myList)
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }

    
    
}
