package chapter04;

import java.util.Scanner;

public class Exercise04_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		String isbn = input.next();
		int d1 = isbn.charAt(0) - '0';
		int d2 = isbn.charAt(1) - '0';
		int d3 = isbn.charAt(2) - '0';
		int d4 = isbn.charAt(3) - '0';
		int d5 = isbn.charAt(4) - '0';
		int d6 = isbn.charAt(5) - '0';
		int d7 = isbn.charAt(6) - '0';
		int d8 = isbn.charAt(7) - '0';
		int d9 = isbn.charAt(8) - '0';

		int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (checkSum == 10) {
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		} else {
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9+checkSum);
		}
	}
}
