package com.skillstorm.groupwork;

public class Animal {
	
	String name;
	boolean isAlive;
	boolean isExtinct;
	
	public Animal() {
	}
	
	
	public Animal(String name, boolean isAlive, boolean isExtinct) {
		super();
		this.name = name;
		this.isAlive = isAlive;
		this.isExtinct = isExtinct;
	}


	public void talk() {
		System.out.println("yadayadayada");
	}
	
	public Animal reproduce() {
		return new Animal(this.name, true, false);
	}
	
	

}
