package chapter05;

import java.util.Scanner;

public class Exercise05_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();

		int minNumber = (num1 > num2) ? (num2) : (num1);
		int gcd = 0;

		while (minNumber >= 0) {
			if (num1 % minNumber == 0 && num2 % minNumber == 0) {
				gcd = minNumber;
				break;
			}
			minNumber--;
		}
		System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
	}

}