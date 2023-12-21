package Day1.MathRandom;

import java.util.Random;

/*
 * Math.random()
 *      - generates a pseudorandom number where 0.0 <= Math.random() < 1.0
 *      - minimum: 0.0
 *      - maximum: 0.9999 repeating, but never 1
 * 
 * 
 * Random Class
 *      - part of the java.util package
 *      - import java.util.Random;
 *      - provides methods that generate pseudorandom numbers
 *              nextInt(), nextFloat(), nextDouble(), etc.
 * 
 */

public class NumberGenerator {
    public static void main(String[] args) {
        /*
         * Examples using Math.random()
         */

        double rand = Math.random();
        System.out.println(rand);
        System.out.println();

        /*
         * Generate a random int between 0 and 10
         */
        int randomNum = (int)(Math.random() * 11);  // (int)((Math.random() * 10) + 1)
        System.out.println(randomNum);

        /*
         * Generate a range of random numbers from 1 to 10
         */
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for(int i = 0; i < 10; i++) {
            int randomNum1 = (int)(Math.random() * range) + min;
            System.out.println(randomNum1);
        }

        /*
         * Examples using Random class
         */
        System.out.println("----- Randoom class Examples -----");

        Random random = new Random();

        int x = random.nextInt();
        float y = random.nextFloat();
        int z = random.nextInt(10);
        int r = random.nextInt(10) + 1;
        double d = random.nextDouble();


        System.out.println("nextInt(): " + x);  //generates all possible values for an int, positive or negative
        System.out.println("nextFloat(): " + y);    //generates float between 0 and 1, but not 1
        System.out.println("nextDouble(): " + d);
        System.out.println("nextInt(), 0-9:  " + z);
        System.out.println("nextInt(), 1-10:  " + r);
        System.out.println();

        /*
         * Bonus Question!
         * 
         * Generate 10 random numbers that range from 15 to 21.
         * 
         * for (int i = 0; i < 10; i++){
            int a = random.nextInt(7) + 15;
            System.out.println(a);
           }

         * 
         */

        
    }
    
}
