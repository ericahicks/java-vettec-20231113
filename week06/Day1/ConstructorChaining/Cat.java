package Day1.ConstructorChaining;

public class Cat extends Animal {
    String catFoodPreference;

    public Cat(String name, int age, String catFoodPreference) {
        /*
         * super()
         *      - calls a constructor from the parent/super class
         *      - must be the first line in the subclass constructor
         *      - if you dont call super(), java will implicitly call the parent class no-args constructor
         *      - however, if you dont declare the no-args constructor in the parent class, java will give you an error
         */
        super(name, age);
        this.catFoodPreference = catFoodPreference;
    }

    @Override //purely just semantics, lets us know it overrides makeNoise() in the parent class
    public void makeNoise() {
        super.makeNoise(); //calls the super class implementation of makeNoise()
        System.out.println("meow meow meow!");
    }
}
