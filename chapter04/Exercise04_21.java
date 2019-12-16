package chapter04;

import java.util.Scanner;

public class Exercise04_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN: ");
		String number = input.next();
		int numberOfDigit = 0;

		if (number.charAt(3) == '-' && number.charAt(6) == '-') {
			for (int i = 0; i < 11; i++) {
				if (Character.isDigit(number.charAt(i))) {
					numberOfDigit++;
				}
			}
		} else {
			System.out.println(number + " is an invalid social security number");
			System.exit(1);
		}
		if (numberOfDigit == 9) {
			System.out.println(number + " is a valid social security number");
		} else {
			System.out.println(number + " is an invalid social security number");
		}
	}
}
