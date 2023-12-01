package com.skillstorm.lecture.example2;

public class Example2 {
	
	public static void main(String[] args) {
		C c = new C(); // what prints?
	}

}

class A {
	int x;
	public A() {
		System.out.println("In A constructor");
	}
	void doStuff() {
		System.out.println("Doing stuff");
	}
}
class B extends A {
	int y;
	public B() {
		System.out.println("In B constructor");
	}
	void doMoreStuff() {
		System.out.println("Doing more stuff");
	}
	
}
class C extends B {
	public C() { // even if I don't call super() Java always calls super()
		System.out.println("In C constructor");
	}
}