package com.skillstorm;

public class BirdTests {
	public static void main(String[] args) {
		Bird b = new Penguin();
//		b.fly();
		
		Penguin p = new Penguin();
		release(p); // will this run the bird or the penguin fly method??
	}
	
	static void release(Bird b) {
		b.fly(); // overriden methods are chosen based on object type at runtime
	}
	
}

class Bird {
	void fly() {
		System.out.println("Whoosh");
	}
}

class Penguin extends Bird {
	void fly() {
		System.out.println("flop");
	}
}

class Eagle extends Bird {
	
}

class Parrot extends Bird {
	
}
