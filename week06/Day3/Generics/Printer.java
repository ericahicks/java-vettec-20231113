package Day3.Generics;

public class Printer<T extends Animal> {

    T thingToPrint; // T allows us to print any type (Integer, Double, String, etc.)

    // constructor that takes in thingToPrint of type T
    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        //invokes speak() from the Animal class
        thingToPrint.speak();
        System.out.println(thingToPrint);
    }
    
}
