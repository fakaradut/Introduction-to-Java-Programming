package chapter05;

import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int space = 1; space <= (number - i) * 2; space++) {
				System.out.print(" ");
			}
			for (int patternLeft = i; 0 < patternLeft; patternLeft--) {
				System.out.print(patternLeft + " ");
			}
			for (int patternRight = 2; patternRight <= i; patternRight++) {
				System.out.print(patternRight + " ");
			}
			System.out.println();

		}

	}

}
