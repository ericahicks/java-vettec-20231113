package com.skillstorm.groupwork;

public class VehicleTests {
	
	
	/* Test 1: */
	public void test1() {
		Car car = new Car();
		car.go();
	}
	
	/* Test 2: */
	public void test2() {
		Train train = new Train();
		train.go();
	}
	
	/* Test 3: */
	public void test3() {
		Bike bike = new Bike();
		bike.go();
	}
	
	/* Test 4: IS-A vehicle*/
	public void test4() {
		Vehicle vehicle1 = new Car();
		Vehicle vehicle2 = new Train();
		Vehicle vehicle3 = new Bike();
	}


}
