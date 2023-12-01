package com.skillstorm.lecture.example3;

public class Example3 {
	
	public static void main(String[] args) {
		C c = new C(); // What prints?
		
	}

}

class A {
	static {
		System.out.println("In A static block");
	}
	int x;
	public A() { 
		System.out.println("In A constructor");
		this.x = 1;
	}
//	public A(int x, int z) {
//		this.x = x;
//		this.z = z;
//	}
	void doStuff() {
		System.out.println("Doing stuff");
	}
}

class B extends A {
	static {
		System.out.println("In B static block");
	}
	int y;
	public B() {
		System.out.println("In B constructor");
		this.y = 2;
	}
	void doMoreStuff() {
		System.out.println("Doing more stuff");
	}
	
}
class C extends B {
	static {
		System.out.println("In C static block");
	}
	public C() { // even if I don't call super() Java always calls super()
		System.out.println("In C constructor");
	}
}