package com.skillstorm.groupwork;


public class Animal {
	
	private String name;
	private boolean isAlive;
	private boolean isExtinct;
	
	public Animal() {
		this.name = "unknown";
		this.isAlive = true;
		this.isExtinct = false;
	}
	
	
	public Animal(String name, boolean isAlive, boolean isExtinct) {
		this.name = name;
		this.isAlive = isAlive;
		this.isExtinct = isExtinct;
	}


	public void talk() {
		System.out.println("Hi, I am " + name);
	}
	
	public Animal reproduce() {
		return new Animal(this.name, true, false);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	public boolean isExtinct() {
		return isExtinct;
	}


	public void setExtinct(boolean isExtinct) {
		this.isExtinct = isExtinct;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // check memory address
			return true;
		}
		if (obj == null) { // null check before try accessing 
			return false;
		}
//		if (obj instanceof Cat) { // returns true for any subclass -- breaks symmetry contract b == a but a != b
		                          //                               -- useful for Collections API sorting animals cats and dogs by name
		if (obj.getClass() == getClass()) { // returns true if exactly the same class  -- keeps symmetry of equals
			return false;
		}
		Animal other = (Animal) obj;
		if (isAlive != other.isAlive) {
			return false;
		}
		if (isExtinct != other.isExtinct) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", isAlive=" + isAlive + ", isExtinct=" + isExtinct + "]";
	}
	

}
