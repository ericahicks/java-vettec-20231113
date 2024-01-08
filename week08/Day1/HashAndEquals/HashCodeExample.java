package Day1.HashAndEquals;

import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {

        Person p = new Person("Rod", "person@email.com");
        Person p2 = new Person("Sean", "person@email.com");

        //Person p = new Person("Naser");
        //Person p2 = new Person("Nasser");

        //System.out.println(p == p2);
        System.out.println(p.equals(p2)); //returns false before overriding equals()

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
    }
}

class Person {
    String name;
    String email;

    Person() { }

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int hashCode() {
        // final int prime = 31;
        // int result = 1;
        // result = prime * result + ((name == null) ? 0 : name.hashCode());
        // result = prime * result + ((email == null) ? 0 : email.hashCode());
        // return result;

        return Objects.hash(name, email);//does the same as above

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        //check if name is equal to the other Persons name
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        //check if email is equal to the other Persons email
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    

}