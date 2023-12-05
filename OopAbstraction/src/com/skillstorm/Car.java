package com.skillstorm;

public class Car implements Driveable, Purchaseable {
	
	@Override // annotation tells the compiler to double check my method signature matches
	public void drive() {
		System.out.println("vrooom");
	}
	
	@Override
	public void drive(int miles) {
		for (int i = 0; i < miles; i++) {
			drive();
		}
	}
	
	@Override
	public void stop() {
		System.out.println("screeeeeeeeech");
	}

	@Override
	public void buy(double price) {
	}

	@Override
	public void sell(double price, String owner) {
		
	}

}
