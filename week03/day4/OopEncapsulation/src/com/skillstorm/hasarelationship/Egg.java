package com.skillstorm.hasarelationship;

public class Egg {
	
	int weight;
	
	Chicken chicken;
	
	public Egg() {
		
	}
	
	public Egg(Chicken chick) {
		this.chicken = chick;
	}

	@Override
	public String toString() {
		return "Egg [weight=" + weight + ", chicken=" + chicken.color + " chicken]";
	}


}
