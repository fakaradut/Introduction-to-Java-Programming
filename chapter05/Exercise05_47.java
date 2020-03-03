package chapter05;

import java.util.Scanner;

public class Exercise05_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10 - ( d1 + 3 d2 + d3 + 3 d4 + d5 + 3 d6 + d7 + 3 d8 + d9 + 3 d10 + d11 + 3
		 * d12)%10
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.next();

		switch (isbn.length()) {
		case 12:

			break;

		default:
			System.out.println(isbn + " is an invalid input");

			System.exit(0);
			break;
		}

		int toplam = 0;
		for (int i = 0; i < 12; i++) {
			if ((i + 1) % 2 != 0) {
				toplam += isbn.charAt(i) - 48;
			} else {
				toplam += (3 * (isbn.charAt(i) - 48));
			}
		}
		int formul = (10 - toplam % 10);

		System.out.println("The ISBN-13 number is " + ((formul == 10) ? (isbn + 0) : (isbn + formul)));

	}
}
