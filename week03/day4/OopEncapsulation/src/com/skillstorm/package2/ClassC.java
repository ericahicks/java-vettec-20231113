package com.skillstorm.package2;

// We must import a class if it is from a separate package!
import com.skillstorm.package1.ClassA;
//import com.skillstorm.package1.ClassD; // cannot import non-public classes!

public class ClassC {
	
	public static void main(String[] args) {
		// ClassA is from a separate package!
		ClassA a = new ClassA();
		System.out.println(a.x); 
//		System.out.println(a.y); 
//		System.out.println(a.z);
	}

}
