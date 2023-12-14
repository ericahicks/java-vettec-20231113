package com.skillstorm;

public class PrefixVsPostfixLoop {
	
	public static void main(String[] args) {
		System.out.println("Postfix ");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println("Prefix ");
		for (int i = 0; i < 3; ++i) {
			System.out.println(i);
		}
		System.out.println("Postfix ");
		for (int i = 0; i < 3; ) {
			System.out.println(i++);
		}
		System.out.println("Prefix ");
		for (int i = 0; i < 3; ) {
			System.out.println(++i);
		}
		System.out.println("Postfix ");
		for (int i = 0; i < 3; ) {
			int j = i++;
			System.out.println("j=" + j);
		}
		System.out.println("Prefix ");
		for (int i = 0; i < 3; ) {
			int j = ++i;
			System.out.println("j=" + j);
		}
	}

}
