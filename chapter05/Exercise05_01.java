package chapter05;

import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int pozitive = 0;
		int negative = 0;
		double sum = 0;
		double average = 0;

		System.out.println("Enter an integer, the input ends if it is 0:");
		do {

			number = input.nextInt();
			if (number > 0) {
				pozitive++;
			} else if (number < 0) {
				negative++;
			}
			sum += number;

		} while (number != 0);
		average = 1. * sum / (negative + pozitive);
		System.out.println("The number of positives is " + pozitive + "\nThe number of negatives is " + negative
				+ "\nThe total is " + sum + "\nThe average is " + average);
	}
}
