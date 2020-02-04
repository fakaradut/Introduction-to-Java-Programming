package chapter05;

import java.util.Scanner;

public class Exercise05_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		System.out.println("Pattern A: ");
		for (int i = 1; i <= number; i++) {
			for (int pattern = 1; pattern <= i; pattern++) {
				System.out.print(pattern + " ");
			}
			System.out.println();
		}

		System.out.println("Pattern B:");

		for (int i = 1; i <= number; i++) {
			for (int pattern = 1; pattern <= number + 1 - i; pattern++) {
				System.out.print(pattern + " ");
			}
			System.out.println();
		}

		System.out.println("Pattern C:");

		for (int i = 1; i <= number; i++) {
			for (int space = 1; space <= (number - i) * 2; space++) {
				System.out.print(" ");
			}
			for (int pattern = i; 0 < pattern; pattern--) {
				System.out.print(pattern + " ");
			}
			System.out.println();
		}
		System.out.println("Pattern D:");
		for (int i = 1; i <= number; i++) {
			for (int space = 1; space < i * 2 - 1; space++) {
				System.out.print(" ");
			}
			for (int pattern = 1; pattern <= number + 1 - i; pattern++) {
				System.out.print(pattern + " ");
			}
			System.out.println();

		}
	}
}
