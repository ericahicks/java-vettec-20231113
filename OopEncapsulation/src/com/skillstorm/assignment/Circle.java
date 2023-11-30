package com.skillstorm.assignment;

// static imports let us refer to the property without specifying the class name
// Tells Java everytime I refer to PI I mean Math.PI
import static java.lang.Math.PI;

public class Circle /* Inherits all the methods from the generic Object class in Java */{
	
	double radius;
//	static final double PI = Math.PI; // alternative is use a static import instead of redeclaring it here
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public double area() {
//		return radius * radius * Math.PI; // radius^2 * pi
		return radius * radius * PI; // radius^2 * pi
	}
	
	public String toString() {
		return "The circle has a radius of " + this.radius;
	}
	
	public boolean equals(Circle other) {
		if (other == null)
			return false;
		return this.radius == other.radius;
	}
	

}
