package com.skillstorm.assignment;

// static imports let us refer to the property without specifying the class name
// Tells Java everytime I refer to PI I mean Math.PI
import static java.lang.Math.PI;

// Can only make classes public, default
public class Circle /* Inherits all the methods from the generic Object class in Java */{
	// "Fully encapsulated"
	// = make all fields private
	// excpetion to the rule is static final properties can be public
	
	private double radius;
//	public static final double PI = Math.PI; // alternative is use a static import instead of redeclaring it here
	
	// Getter
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double value) {
		if (value >= 0) {
			this.radius = value;
		}
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
	public double getArea() {
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
