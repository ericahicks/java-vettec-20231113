package com.skillstorm;

public class Car {

	int year;
	String make;
	String model;
	String color;
	Person owner;
	String vin;
	int howManyCupHolders;
	boolean hasRecall;
	boolean hasLicensePlate;
	boolean isRegistered;
	double mileage;
	
	double gasInTank;

	public Car() { // no-arg constructor
		// here I set my own defaults
		this.year = 2023;
		this.make = "Chevy";
		this.model = "Nova";
		this.color = "Blue with White Pinstripes";
		this.owner = new Person("");
		this.vin = "123abc124";
		this.howManyCupHolders = 0;
		this.hasRecall = true;
		this.hasLicensePlate = false;
		this.isRegistered = false;
		this.mileage = 20.5;
	}

	public Car(int year, String make, String model) {
		this(); // to call another constructor don't do Car() instead do this() but has to be
				// the first line of code
		this.year = year;
		this.make = make;
		this.model = model;
	}

	public Car(int year, String make, String model, String color, double mileage) {
		this(); // calls the no-arg constructor which sets everything to the defaults I coded
				// above
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.mileage = mileage;
	}

	public Car(int year, String make, String model, String color, Person owner, String vin, int howManyCupHolders,
			boolean hasRecall, boolean hasLicensePlate, boolean isRegistered, double mileage) {
		this(); 
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.owner = owner;
		this.vin = vin;
		this.howManyCupHolders = howManyCupHolders;
		this.hasRecall = hasRecall;
		this.hasLicensePlate = hasLicensePlate;
		this.isRegistered = isRegistered;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + ", color=" + color + ", owner=" + owner
				+ ", vin=" + vin + ", howManyCupHolders=" + howManyCupHolders + ", hasRecall=" + hasRecall
				+ ", hasLicensePlate=" + hasLicensePlate + ", isRegistered=" + isRegistered + ", mileage=" + mileage
				+ "]";
	}

	// To generate a Constructor or toString method
	// RT click > Source > Generate toString...

}
