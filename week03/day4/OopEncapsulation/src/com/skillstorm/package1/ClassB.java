package com.skillstorm.package1;

public class ClassB {
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.x);  // visible bc public
		System.out.println(a.y);  // visible bc package private
//		System.out.println(a.z);  // not visible bc private
	}

}
