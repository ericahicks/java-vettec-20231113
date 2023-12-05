package com.skillstorm.groupwork;

public class VehicleTests {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	
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
	
	/* Test 5: Commute */
	public void test5() {
		Person bob = new Person("Bob", new Bike());
		bob.commute();
	}


}
