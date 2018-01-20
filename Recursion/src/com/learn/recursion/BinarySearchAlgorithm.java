package com.learn.recursion;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {

		int[] array = new int[] { -5, 1, 2, 5, 6, 20, 45, 65 };
		System.out.println(search(array, 45));
	}

	private static int search(int[] array, int i) {
		int position =  binarySearch(array, i, 0, array.length - 1);
		return position;

	}

	private static int binarySearch(int[] array, int item, int startIndex, int endIndex) {
		if (endIndex < startIndex) {
			return -1;
		}

		int middleIndex = startIndex + (endIndex - startIndex) / 2;

		if (array[middleIndex] == item) {
			return middleIndex;
		} else if (item < array[middleIndex]) {
			return binarySearch(array, item, startIndex, middleIndex - 1);
		} else {
			return binarySearch(array, item, middleIndex + 1, endIndex);
		}

	}

}
