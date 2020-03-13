package chapter06;

import java.util.Scanner;

public class Exercise06_05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three number:");

		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		displaySortedNumbers(num1, num2, num3);

	}

	public static void displaySortedNumbers(double number1, double number2, double number3) {
		double maxNumber = Math.max(number1, Math.max(number2, number3));
		double minNumber = Math.min(number1, Math.min(number2, number3));
		double midNumber = 0;

		if (number1 <= number2 && number2 <= number3 || number3 <= number2 && number2 <= number1) {
			midNumber = number2;
		} else if (number2 <= number1 && number1 <= number3 || number3 <= number1 && number1 <= number2) {
			midNumber = number1;
		} else {
			midNumber = number3;
		}
		System.out.println(maxNumber + "  " + midNumber + "  " + minNumber);

	}

}
