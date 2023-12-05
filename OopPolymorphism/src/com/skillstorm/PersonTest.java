package com.skillstorm;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new HairStylist();
		p.name = "Bob";
		p.cut();
//		p.cut(2); // will not compile
		((HairStylist) p).cut(2);
//		Hairstylist.cut(2); // will not compile need an obj to call isntance method
		
		// Type Casting
		Surgeon s = new Surgeon();
		s.name = "Sue";
		s.specialty = "Brain surgery";
		Surgeon s2 = (Surgeon) p; //  java.lang.ClassCastException: com.skillstorm.HairStylist cannot be cast to com.skillstorm.Surgeon
		
	}
	
	
}
class Person {
	
	String name;
	
	
	void cut() {
		System.out.println("Shaving all hair off");
	}
}
class HairStylist extends Person {
	// inherits cut()
	
	// overload
	void cut(int x) {
		System.out.println("Cutting off " + x + " inches");
	}
}
class Surgeon extends Person {
	String specialty;
	
	// override
	void cut() {
		System.out.println("Making an incision");
	}
	
	void cut(String location) {
		System.out.println("Making an incision in the " + location);
	}
	
	Person getPerson() {
		Person obj = new Person();
		obj.name = this.name;
		return obj;
	}
}
