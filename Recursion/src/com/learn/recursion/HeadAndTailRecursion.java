package com.learn.recursion;

public class HeadAndTailRecursion {

	public static void main(String[] args) {

		int input = 5;

		// headRecursion(input);
		tailRecursion(input);

	}

	private static void tailRecursion(int input) {
		if (input == 0) {
			return;
		}
		System.out.println(input);
		tailRecursion(input - 1);
	}

	private static void headRecursion(int input) {

		if (input == 0) {
			return;
		}

		headRecursion(input - 1);
		System.out.println(input);

	}

}
