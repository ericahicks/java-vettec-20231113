package com.skillstorm.groupwork;

import java.util.Objects;

public class Cat /* Make Cat inherite from Animal */ extends Animal {
	/* Add some properties*/
	private boolean declawed = false;
	
	/* Getters and Setters */
	public boolean isDeclawed() {
		return declawed;
	}
	
	public void setDeclawed(boolean value) {
		if (value == true) {
			System.out.println("You cannot declaw your cat. It is cruel.");
		}
		this.declawed = value;
	}
	
	/* Override the talk method*/
	@Override
	public void talk() {
		System.out.println("meow");
	}
	

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) { // compare memory address
//			return true;
//		}
//		if (!super.equals(obj)) { // call the parent class to compare only the inherited properties
//			return false;
//		}
//		if (!(obj instanceof Cat)) {  // check if obj is teh same or a subclass
//			return false;
//		}
//		Cat other = (Cat) obj; // type casting
//		if (declawed != other.declawed) { // checking the properties one by one
//			return false;
//		}
//		return true; // return true if none of the above comparisons failed
//	}

	
	
	
	
	public String toString() {
		return "A cat with name " + getName() + " that is alive and is declawed is " + declawed;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) // compare memory address
			return true;
		if (!super.equals(obj)) // compare using the parent method
			return false;
		if (getClass() != obj.getClass())  // compare exact class (subclass isn't good enough)
			return false;
		Cat other = (Cat) obj;
		return declawed == other.declawed; // 
	}
	
	
}
