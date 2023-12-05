package com.skillstorm.groupwork;

public class Car /* TODO 1 make Car a vehicle */{
	private String make;
	private String model;
	 int year;
	
	private final int gasTankSize;
	
	public Car() {	
		this.gasTankSize = 10;
	}
	
	public Car(String make, String model, int year, int gasTankSize) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.gasTankSize = gasTankSize;
	}
}
