package Day3.ComparatorPractice;

import java.util.Comparator;

public class IqComparator implements Comparator<Person> {

    //Calculate the Iq difference
    //If the Iq difference is negative than p1 has a lower Iq than p2
    //If the Iq difference is positive then p1 hsa a higher Iq than p2

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getIq() - p2.getIq();
    }
}
