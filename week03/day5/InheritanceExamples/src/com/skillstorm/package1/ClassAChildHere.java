package com.skillstorm.package1;

public class ClassAChildHere extends ClassA {
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.x); // yes can print bc public 
		System.out.println(a.hmmm); // yes bc protected lets us in same package and child classes
		System.out.println(a.y); // yes bc in same package
		System.out.println(a.z); // no
	}
	
	public void printProperties() {
		System.out.println(this.x);
		System.out.println(this.hmmm);
		System.out.println(this.y);
		System.out.println(this.z);
	}

}
