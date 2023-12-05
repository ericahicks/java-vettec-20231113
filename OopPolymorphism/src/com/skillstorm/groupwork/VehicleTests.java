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
	public static void test1() {
		Car car = new Car();
		car.go();
	}
	
	/* Test 2: */
	public static void test2() {
		Train train = new Train();
		train.go();
	}
	
	/* Test 3: */
	public static void test3() {
		Bike bike = new Bike();
		bike.go();
	}
	
	/* Test 4: IS-A vehicle*/
	public static void test4() {
		Vehicle vehicle1 = new Car();
		Vehicle vehicle2 = new Train();
		Vehicle vehicle3 = new Bike();
		System.out.println("Test4 success.");
	}
	
	/* Test 5: Commute */
	public static void test5() {
		Person bob = new Person("Bob", new Bike());
		bob.commute();
	}


}
