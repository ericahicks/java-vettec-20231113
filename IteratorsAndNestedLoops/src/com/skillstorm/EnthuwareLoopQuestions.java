package com.skillstorm;

public class EnthuwareLoopQuestions {

	public static void main(String[] args) {

	}

	public static void test1Problem14() {
		String[] sa = { "a", "b", "c" };
		for (String s : sa) {
			if ("b".equals(s))
				continue;
			System.out.println(s);
			if ("b".equals(s))
				break;
			System.out.println(s + " again");
		}
	}

	public static void test1Problem16() {
		int i = 1, j = 10;
		do {
			if (i++ > --j)
				continue;
		} while (i < 5);
		System.out.println("i=" + i + " j=" + j);
	}

	public static void test1Problem34() {
		int count = 0, sum = 0;
		do {
			if (count % 3 == 0)
				continue;
			sum += count;
		} while (count++ < 11);
		System.out.println(sum);
	}

	public static void test1Problem56() {
		int counter = 0;
		outer: for (int i = 0; i < 3; i++)
			middle: for (int j = 0; j < 3; j++)
				inner: for (int k = 0; k < 3; k++) {
					if (k - j > 0)
						break middle;
					counter++;
				}
		System.out.println(counter);
	}
}
