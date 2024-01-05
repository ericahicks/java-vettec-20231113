package Day4.SortingArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortingArraysWithComparable {
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
        
        System.out.println("Before sorting array:");
        System.out.println(Arrays.asList(cats));
        System.out.println("After sorting array:");
        //Arrays.sort(cats);
        Arrays.sort(cats, Collections.reverseOrder()); //reverseOrder() uses the Comparable interface
        System.out.println(Arrays.asList(cats));
    }
}

class Cat implements Comparable<Cat>{
    String name;
    int cuteness;

    public Cat(String name, int cuteness) {
        this.name = name;
        this.cuteness = cuteness;
    }

    @Override
    public String toString() {
        return name + " (Cuteness: " + cuteness + ")";
    }


    //returns negative number if this is less cute
    //returns 0 if the same cuteness
    //returns positive number if this is cuter
    @Override
    public int compareTo(Cat that) {
        return this.cuteness - that.cuteness; //larger cuteness returns positive number
        //return that.cuteness - this.cuteness; //reverse the order of the array
    }
}
