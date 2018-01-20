package com.learn.recursion;

public class FactorialUsingAccumulator {

	public static void main(String[] args) {

		int input = 5;
		int output = calcFactorial(1,input);

		System.out.println(output);
	}

	private static int calcFactorial(int accumulator,int input) {

		if (input == 0) {
			return accumulator;
		}

		return calcFactorial(accumulator*input,input - 1);
	}

}
