package Day1.ConstructorChaining;

public class Animal {
    String name;
    int age;

    public Animal() { }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Hello, I am an animal!");
    }
}
