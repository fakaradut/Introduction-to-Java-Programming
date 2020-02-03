package chapter05;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();

		System.out.println("The factors for " + number + " is");
		int factor = 2;
		while (factor <= number) {
			if (number % factor == 0) {
				number /= factor;
				System.out.print(factor + " ");
			} else {
				factor++;
			}
		}
	}

}
