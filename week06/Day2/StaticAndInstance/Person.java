package Day2.StaticAndInstance;

/*
 * Instance (non-static) Fields and Methods
 *      -> invoked on objects, use the instance name
 *      -> can directly access instance variables and methods
 * 
 * Static Fields and Methods
 *      -> invoked by using the class name
 *      -> can NOT access instance variables and methods, but can directly access static fields and methods
 * 
 * 
 */

public class Person {

    //static variable
    private static int personCount = 0;

    //instance variables
    String name;
    int age;
    String placeOfWork;

    //instance method
    public void printMessage() {
        System.out.println("I like pickles");
    }

    
    public Person() {
        personCount++;
    }

    //static method
    public static int getPersonCount() {
        return personCount;
    }

}