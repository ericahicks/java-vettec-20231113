package Day2.StaticAndInstance;

public class Main {
    public static void main(String[] args) {

        System.out.println(Person.getPersonCount());

        Person person1 = new Person();
        person1.printMessage();

        //Person.printMessage(); BAD - can NOT invoke non-static method using a class

        person1.name = "Carlos";
        person1.age = 21;
        person1.placeOfWork = "SkillStorm";

        //Person.name = "Jim"; BAD

        System.out.println(Person.getPersonCount());

        Person person2 = new Person();
        person2.printMessage();

        System.out.println(Person.getPersonCount());

        //System.out.println(Person.class.getName()); 
    
    }
    
}
