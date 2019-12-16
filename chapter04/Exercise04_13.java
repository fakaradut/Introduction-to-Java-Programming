package chapter04;

import java.util.Scanner;

public class Exercise04_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char ch = input.next().charAt(0);

		if (Character.isLetter(ch)) {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch + " is a vowel");
			} else {
				System.out.println(ch + " is a consonant");
			}
		} else {
			System.out.println(ch + " is an invalid input");
		}
	}

}
