package com.skillstorm;

public class AnimalTestsPolymorphism {
	public static void main(String[] args) {
		Animal tom = new Turtle();
		tom.run(); // trudging along slowly 
		tom.sleep(); // zzzzz
	}
}

class Animal {
	
	void run() {
		System.out.println("run");
	}
	
	static void sleep() {
		System.out.println("zzzzz");
	}
}

class Turtle extends Animal {
	void run() {
	    System.out.println("trudging along slowly");
	}
	
	static void sleep() {
		Animal.sleep();
		System.out.println("like a turtle");
	}
}