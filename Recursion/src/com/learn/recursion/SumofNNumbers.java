package com.learn.recursion;

public class SumofNNumbers {

	public static void main(String[] args) {

		int input = 5;
		//System.out.println(iterativeApproach(input));
		
		System.out.println(recursiveApproach(input));
	}

	private static int recursiveApproach(int input) {
		if(input == 1){
			return 1;
		}
		
		return input + recursiveApproach(input-1);
	}

	private static int iterativeApproach(int input) {
		int result = 0;
		for(int i=1;i<=input;++i){
			result+=i;
		}
		return result;
	}

}
