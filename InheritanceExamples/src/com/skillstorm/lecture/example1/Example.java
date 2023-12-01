package com.skillstorm.lecture.example1;

public class Example {
	
	public static void main(String[] args) {
		B b = new B();
		b.doStuff();
		b.doMoreStuff();
		System.out.println(b.x + " " + b.y);
	}

}

class A {
	int x;
	void doStuff() {
		System.out.println("Doing stuff");
	}
}
class B extends A {
	int y;
	void doMoreStuff() {
		System.out.println("Doing more stuff");
	}
	
}