package com.learn.recursion;

public class Factorial {

	public static void main(String[] args) {

		int input = 5;
		int output = calcFactorial(input);

		System.out.println(output);
	}

	private static int calcFactorial(int input) {

		if (input == 0) {
			return 1;
		}

		return input * calcFactorial(input - 1);
	}

}
