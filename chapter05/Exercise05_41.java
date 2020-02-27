package chapter05;

import java.util.Scanner;

public class Exercise05_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int count = 0;
		int maxNumber = 0;
		do {
			System.out.println("Enter numbers: ");
			number = input.nextInt();

			if (maxNumber == number) {
				count++;
			} else if (number < maxNumber) {

			} else {
				count = 1;
			}
			maxNumber = Math.max(number, maxNumber);

		} while (number != 0);
		System.out.println(
				"The largest number is: " + maxNumber + "\nThe occurrence count of the largest number is: " + count);
	}
}
