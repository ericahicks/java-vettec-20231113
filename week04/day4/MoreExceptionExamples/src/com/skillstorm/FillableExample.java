package com.skillstorm;

public class FillableExample {

}

interface Fillable {
	/*
	 * Returns the amount left
	 */
	double empty(double amount);
	
	/*
	 * Returns the new current amount
	 */
	void fill(double amount);
}

class Container implements Fillable {
	
	final double SIZE = 16;
	double contents = 0;

	@Override
	public double empty(double amount) {
		return contents -= amount;
	}

	@Override
	public void fill(double amount) {
		if (amount + contents > SIZE)
			throw new RuntimeException();
		contents += amount;
	}
	
}
