package Day4.SortingArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class SortingArraysWithComparator {
    public static void main(String[] args) {
        Random generator = new Random();
        Cat cat1 = new Cat("Boots", generator.nextInt(10) + 1);
        Cat cat2 = new Cat("Lola", generator.nextInt(10) + 1);
        Cat cat3 = new Cat("Shadow", generator.nextInt(10) + 1);
        Cat cat4 = new Cat("Momi", generator.nextInt(10) + 1);
        Cat cat5 = new Cat("Yugi", generator.nextInt(10) + 1);
        Cat cat6 = new Cat("Cat", generator.nextInt(10) + 1);
        Cat cat7 = new Cat("Dog", generator.nextInt(10) + 1);
        Cat cat8 = new Cat("Yuki", generator.nextInt(10) + 1);
        System.out.println(cat1);

        Cat[] cats = new Cat[8];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;
        cats[5] = cat6;
        cats[6] = cat7;
        cats[7] = cat8;

        System.out.println("Before sorting in alphabetical order:");
        System.out.println(Arrays.asList(cats));
        System.out.println("After sorting in alphabetical order:");
        Arrays.sort(cats, new AlphabeticalCatComparator());
        System.out.println(Arrays.asList(cats));
        System.out.println("Reversed sorting in alphabetical order:");
        Arrays.sort(cats, new AlphabeticalCatComparator().reversed()); //reversed uses the Comparator interface
        System.out.println(Arrays.asList(cats));
    }
}

//Create a comparator that orders that cats by name
//Step 1: implement Comparator
//Step 2: override the method compare(Cat o1, Cat o2)
class AlphabeticalCatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.name.compareTo(o2.name);
    }
}
