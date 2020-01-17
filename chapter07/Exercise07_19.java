package chapter07;

import java.util.Scanner;

public class Exercise07_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of list: ");
		final int NUMBER_OF_LIST = input.nextInt();
		int[] list = new int[NUMBER_OF_LIST];
		System.out.println("Enter the list: ");
		for (int i = 0; i < NUMBER_OF_LIST; i++) {
			list[i] = input.nextInt();
		}
		System.out.println(isSorted(list) ? "The list is already sorted" : "The list is not sorted");

	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}
}