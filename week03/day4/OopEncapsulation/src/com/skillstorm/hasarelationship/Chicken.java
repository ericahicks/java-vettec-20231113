package com.skillstorm.hasarelationship;

public class Chicken {
	
	String color;
	
	Egg egg;
	
	public Chicken() {
		
	}
	
	public Chicken(Egg egg) {
		this.egg = egg;
	}

	@Override
	public String toString() {
		return "Chicken [color=" + color + ", egg=" + egg + "]";
	}
	
}
