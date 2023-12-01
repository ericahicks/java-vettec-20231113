package com.skillstorm.codedemo;


public class MethodOverloadingExamples extends com.skillstorm.lecture.example1.Example {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
//		a.getStuff();
//		b.getStuff();
		b.getMoreStuff();
	}

}
// Can't have two classes with the same name in the same package
// packages are "name spaces"
// So I CAN have classes with the same name in different packages
// fully qualified name lets me use 
class A  {
	int x;
	
	public A getStuff() {
		System.out.println("A stuff");
		return new A();
	}
	
	public static void doSumthin() {
		System.out.println("doing sumthin in A");
	}
	
	
}

class B extends A {
	
	public A getStuff() {
		System.out.println("B stuff");
		return new A();
	}
	
	public A getMoreStuff() {
		A a = super.getStuff();
		A a2 = this.getStuff();
		A a3 = getStuff(); // which version will get called?
		a.x = 1000000;
		return a;
	}
	

	public static void doSumthin() {
		System.out.println("doing sumthin in B");
	}
	
}

class C extends B {
	@Override
//	public C getMoreStuff(int x) { // @Override makes sure I'm matching the signature correctly
		public C getMoreStuff() {
//		return super.super.getStuff(); // can't get grandparent's implementation
		C c = new C();
		A.doSumthin(); 
		B.doSumthin();
		C.doSumthin();
		return c;
//		return super.getStuff(); // can get paren'ts version
	}
	

	public static void doSumthin() {
		System.out.println("doing sumthin in B");
	}
}