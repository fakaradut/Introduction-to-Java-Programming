package chapter07;

import java.util.Scanner;

public class Exercise07_30 {
	public static void main(String[] args) {
		Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int size = input.nextInt();
		int[] values = new int[size];
		System.out.print("Enter the values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		if (isConsecutiveFour(values)) {
			System.out.println("The list has consecutive fours");
		} else {
			System.out.println("The list has no consecutive fours");
		}
	}

	public static boolean isConsecutiveFour(int[] values) {
		int consecutiveCount = 1;

		for (int i = 0; i < values.length - 1; i++) {
			int value = values[i];

			if (values[i + 1] == value && consecutiveCount != 4) {
				consecutiveCount++;
			} else if (consecutiveCount == 4) {
				return true;
			} else if (value != values[i + 1]) {
				consecutiveCount = 1;
			}
		}

		return false;
	}
}
