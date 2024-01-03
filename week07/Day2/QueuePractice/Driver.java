package Day2.QueuePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        State florida = new State("Florida");
        City jacksonville = new City("Jacksonville", 962970, florida);
        City miami = new City("Miami", 439890, florida);
        City tallahassee = new City("Tallahssee", 197102, florida);

        ArrayList<City> floridaCities = new ArrayList<>(Arrays.asList(jacksonville, miami, tallahassee));
        florida.setCapital(tallahassee);
        florida.setCities(floridaCities);
        System.out.println(florida);

        /*
         * This is known as Method Chaining
         *  - I get an object from an object, and with that object, I get the property off it all at once
         * 
         * Pros and Cons
         * 
         * Pros:
         *  - No wasted space with a local variable
         *  - More concise syntax, can do it in one line
         * 
         * Cons:
         *  - If you have to use it more than once, it quickly becomes redundant to do it in the chaining way
         * 
         */

         System.out.println("Miami's state is " + miami.getState().getName());
         System.out.println("Florida's state capital is " + miami.getState().getCapital().getName());

        //above is the same as typing this
         State miamiState = miami.getState();
         System.out.println(miamiState.getName());
         City miamiStateCapital = miamiState.getCapital();
         System.out.println(miamiStateCapital.getName());


    }
}
