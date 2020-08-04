package chapter18;

import java.util.Scanner;

public class Exercise18_14 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a string: ");
			String s = input.nextLine();
			System.out.println("Number of uppercase letter in string is: " + numberOfUpperCaseLetter(s));
		}
	}

	public static int numberOfUpperCaseLetter(String str) {
		return numberOfUpperCaseLetter(str, 0);
	}

	private static int numberOfUpperCaseLetter(String str, int count) {
		if (str.length() <= 0) {
			return 0;
		} else {
			count += numberOfUpperCaseLetter(str.substring(1), count)
					+ (('A' <= str.charAt(0) && str.charAt(0) <= 'Z') ? 1 : 0);
			return count;
		}
	}

}