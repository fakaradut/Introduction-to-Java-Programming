package chapter06;

import java.util.Scanner;

public class Exercise06_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = input.nextLine();

		System.out.println(countLetters(s));
	}

	public static int countLetters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
