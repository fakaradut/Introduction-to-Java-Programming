package chapter05;

import java.util.Scanner;

public class Exercise05_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();

		for (int row = 1; row <= number; row++) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print("    ");

			}
			for (int pattern = 1; pattern <= row; pattern++) {
				if (pattern == 1) {
					System.out.print(pattern);
				} else {
					System.out.printf("%4d", (int) (Math.pow(2, pattern - 1)));
				}
			}

			for (int x = 1; x <= row - 1; x++) {
				System.out.printf("%4d", (int) Math.pow(2, row - x - 1));
			}

			System.out.println();
		}
	}
}
