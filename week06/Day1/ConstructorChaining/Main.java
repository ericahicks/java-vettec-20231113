package Day1.ConstructorChaining;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        System.out.println("My dog's name is " + myDog.getName() + " he is " + myDog.getAge());
        myDog.makeNoise();

        Cat myCat = new Cat("Mish Mish", 10, "Tuna" );
        System.out.println("My cat's name is " + myCat.name + " She is " + myCat.age + " and her favorite food is " + myCat.catFoodPreference);
        myCat.makeNoise();
    }
    
}
