package com.skillstorm.package2;

import com.skillstorm.package1.ClassA;

public class ClassAChildThere extends ClassA {
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.x); // yes
		System.out.println(a.hmmm); // no bc protected and must be in same package
		System.out.println(a.y); // no bc default must be in same package
		System.out.println(a.z); // no bc must be in same class
	}
	
	// If you want to share a bunch of info outside the package use public or protected
	public void printProperties() {
		System.out.println(this.x); // yes bc public
		System.out.println(this.hmmm); // yes bc protected members are inhertied inside and outside the package
		System.out.println(this.y); // no? bc package private members aren't inherited outside the package
		System.out.println(this.z); // no? bc private members aren't inherited
	}

}
