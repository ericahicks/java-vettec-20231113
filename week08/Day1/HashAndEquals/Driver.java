package Day1.HashAndEquals;

import java.util.HashSet;

import javax.smartcardio.CommandAPDU;

public class Driver {
    public static void main(String[] args) {
        Company stateFarm = new Company("State Farm", 7500, "abc10103");
        Company google = new Company("Google", 25000, "abd12123");
        Company google2 = new Company("Google", 25000, "abd12123");

        Occupation stateFarmSalesman = new Occupation("Salesman", stateFarm, 80000);
        Employee matthew = new Employee("Matthew", 21, stateFarmSalesman);
        Employee sam = new Employee("Sam", 52, stateFarmSalesman);
        Employee matthew2 = new Employee("Matthew", 21, stateFarmSalesman);
        System.out.println(matthew);
        System.out.println(sam);
        System.out.println("Are the two equal? " + matthew.equals(matthew2));

        System.out.println("Are the two equal? " + google.equals(google2));

        System.out.println("Hash for stateFarm: " + stateFarm.hashCode());
        System.out.println("Hash for google: " + google.hashCode());
        System.out.println("Hash for google2: " + google2.hashCode());

        /*
         * HashSets
         * 
         * Implements the Set Interface
         * 
         * A grouping of items that does NOT contain duplicates
         * 
         * How does HashSet work?
         * 1. It uses hash codes to place items into buckets for quick and easy lookup time
         * 2. Use the equals() when adding an element to the set to determine if its already in there
         *      - If the item is already in the set, then it doesnt need to add
         *      - If the item is not in the set, it add under the bucket
         * 
         * 
         */

         HashSet<Company> companySet = new HashSet<>();
         companySet.add(stateFarm); 
         System.out.println(companySet);
         companySet.add(google); 
         System.out.println(companySet);
    }
}
