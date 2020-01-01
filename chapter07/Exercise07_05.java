package chapter07;

import java.util.Scanner;

public class Exercise07_05 {
	public static void main(String[] args) {
		printDistinctNumbers(enterTenNumber());

	}

	public static void printDistinctNumbers(int[] array) {
		boolean isDistinct = true;
		int distinctCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					isDistinct = false;
					break;
				}
			}
			if (isDistinct) {
				distinctCount++;
				System.out.print(array[i] + " ");
			}
			isDistinct = true;
		}
		System.out.println("\nThe number of distinct number is " + distinctCount);
	}

	public static int[] enterTenNumber() {
		Scanner input = new Scanner(System.in);
		int[] numberArray = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the number: ");
			numberArray[i] = input.nextInt();
		}
		return numberArray;
	}
}
