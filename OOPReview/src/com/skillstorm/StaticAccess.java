package com.skillstorm;

public class StaticAccess {
	
	public static void main(String[] args) {
		Box b = new Box();
		System.out.println("Box holds x = " + b.x);
		System.out.println("Boxes all hold y = " + Box.y);
		
		BrownBox bb = new BrownBox();
		System.out.printf("BrownBox is %s%n", bb.color);
		System.out.printf("BrownBox holds %s%n", bb.x);
		System.out.printf("BrownBox holds %s%n", Box.y);
		System.out.printf("BrownBox holds %s%n", BrownBox.y);
		
		BrownBox.y = 10;
		
		System.out.println("\nBoxes holds " + Box.y);
		System.out.println("\nBrownBoxes holds " + BrownBox.y);
		
		Person p1 = new Person();
		System.out.println("\nPopoulation is now " + Person.population); // 1
		Person p2 = new Person();
		System.out.println("Popoulation is now " + Person.population); // 2
		Person p3 = new Person();
		System.out.println("Popoulation is now " + Person.population); // 3
		Student s = new Student();
		System.out.println("Population is now " + Student.population); // 1 or 3 or 4?????????
		System.out.println("Population is now " + Person.population); // 13 or 4?????????
	}
	

}
class Person {
	static int population = 0;
	
	public Person() { 
		population++; 
	}
	
}
class Student extends Person {
	
	public Student() { 
		super();
		// calls super() even if I don't
//		population++; // this will increment population twice which we don't want
	}
}

class Box {
	int x = 1;
	static int y = 2;

}

class BrownBox extends Box {
	final String color = "brown";
	
	
}

