package Day3.ComparatorPractice;

import java.util.Collections;
import java.util.LinkedList;

public class Person {

    private String name;
    private int age;
    private int iq;

    public Person() { }

    public Person(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String toString() {
        return "[" + this.name + "," + this.age + "," + this.iq + "]";
    }

    public static void main(String[] args) {
        Person sally = new Person("Sally", 13, 135);
        Person jim = new Person("Jim", 67, 114);
        Person brad = new Person("Brad", 21, 65);
        Person sam = new Person("Sam", 2, 65);

        LinkedList<Person> peopleList = new LinkedList<>();
        peopleList.add(sally);
        peopleList.add(jim);
        peopleList.add(brad);
        peopleList.add(sam);

        System.out.println(peopleList);

        //since we're using the Comparator interface, we can use any of the sort methods(Collections.sort or Arrays.sort)
        //all this doess is allow us to have control over the sort order
        AgeComparator ageComp = new AgeComparator();
        Collections.sort(peopleList, ageComp); //this will sort the peopleList using the AgeComparator
        System.out.println("Sorting by age");
        System.out.println(peopleList);

        Collections.sort(peopleList, new IqComparator());
        System.out.println("Sorting by Iq");
        System.out.println(peopleList);
    }
    
    
}
