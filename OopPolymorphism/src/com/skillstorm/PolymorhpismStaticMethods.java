package com.skillstorm;

public class PolymorhpismStaticMethods {
	
	public static void main(String[] args) {
		A a = new Bb();
		a.doStuffMore();
		// static methods body are bound at compile time
		// Normally this should be obvious
		A.doStuff();
		Bb.doStuff();
		a.doStuff(); // DONT DO THIS static methods should be accessed in a static way
	}

}

class A {
	public static void doStuff() {
		System.out.println("A stuff");
	}
	
	public void doStuffMore() {
		System.out.println("more A stuff");
	}
}

class Bb extends A {
	public static void doStuff() {
		System.out.println("Bb stuff");
	}
	
	public void doStuffMore() {
		System.out.println("more Bb stuff");
	}
}
