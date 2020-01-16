package chapter07;

import diziler.BinarySearch;
import diziler.LinearSearch;

public class Exercise07_16 {
	public static void main(String[] args) {
		int[] array = new int[1_000_000];
		for (int i = 0; i < 1_000_000; i++) {
			array[i] = (int) (Math.random() * 1_000_000);
		}
		int key = (int) (Math.random() * 1_000_000);

		long startTime = System.currentTimeMillis();
		LinearSearch.linearSearch(array, key);
		long endTime = System.currentTimeMillis();
		System.out.println("Linear search: " + (endTime - startTime) + " miliseconds");

		java.util.Arrays.sort(array);
		startTime = System.currentTimeMillis();
		BinarySearch.binarySearch(array, key);
		endTime = System.currentTimeMillis();
		System.out.println("Binary search: " + (endTime - startTime) + " miliseconds");
	}

}
