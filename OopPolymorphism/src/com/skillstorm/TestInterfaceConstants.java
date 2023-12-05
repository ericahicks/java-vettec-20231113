package com.skillstorm;

public class TestInterfaceConstants {
	public static void main(String[] args) {
		B b = new B();
		// DONT DO THIS bad style to access static properties in a non-static way
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(B.x);
		System.out.println(B.y);
		b.x = 10;
	}
}

interface MyInterface {
	/* public static final */ int x = 1;
	/* public final */ static int y = 2;
}

class B implements MyInterface {
	
}
