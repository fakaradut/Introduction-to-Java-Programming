package chapter05;

import java.util.Scanner;

public class Exercise05_36 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		String number = input.next();
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += (i + 1) * (number.charAt(i) - 48);

		}
		System.out.println((sum % 11 == 10) ? (number + "X") : (number + "" + sum % 11));
	}

}
