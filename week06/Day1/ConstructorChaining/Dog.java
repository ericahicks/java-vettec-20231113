package Day1.ConstructorChaining;

/*
 * Constructor Chaining
 *      -> process of calling one constructor from another constructor with respect to the current object
 *      -> can be done in 2 ways:
 *          - this() - for constructors within the same class
 *          - super() - call the constructor from the parent class
 * 
 *      -> why is constructor chaining important?
 *          - allows you to perform multiple tasks within a single constructor
 *          - make program more readable and easier to understand
 * 
 */

public class Dog extends Animal {
    private String name;
    private String color;
    private int age;
    private String size;

    //default constructor
    public Dog() {

        /*
         * this()
         *      - calls one constructor from another constructor within the same class
         *      - must be the first line in the constructor
         */
        this("Good Boy", "Brown", 3, "large");  //calls the parameterized constructor
        
    }

    //parameterized constructor
    public Dog(String name, String color, int age, String size) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.size = size;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public String getSize() {
        return this.size;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("woof woof woof!");
    }
    
}
