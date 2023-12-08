package com.skillstorm;

public class Dog extends Animal {
	
	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		Dog d = new Dog();
		d.eat();
	}

}

class Animal { }