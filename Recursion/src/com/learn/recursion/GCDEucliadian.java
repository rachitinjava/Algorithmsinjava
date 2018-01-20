package com.learn.recursion;

public class GCDEucliadian {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 100;
		int gcd = findGCDIterative(num1, num2);
		System.out.println("GCD :: " + gcd);
	}

	private static int findGCD(int num1, int num2) {

		if (num2 == 0) {
			return num1;
		}

		return findGCD(num2, num1 % num2);
	}
	
	private static int findGCDIterative(int num1, int num2) {

		while(num2 != 0){
			int temp = num2;
			num2 = num1 % num2 ;
			num1 = temp;
		}

		return num1;
	}

	
}
