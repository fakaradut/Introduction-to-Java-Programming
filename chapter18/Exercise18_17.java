package chapter18;

import java.util.Scanner;

public class Exercise18_17 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a list of characters in one line: ");
			char[] chars = input.nextLine().toCharArray();
			System.out.println("Enter a character: ");
			char ch = input.next().charAt(0);
			System.out.println("Number of occurences: " + count(chars, ch));
		}
	}

	public static int count(char[] chars, char ch) {
		return count(chars, ch, 0);
	}

	public static int count(char[] chars, char ch, int high) {
		int result = 0;
		if (high < chars.length)
			result = count(chars, ch, high + 1) + (chars[high] == ch ? 1 : 0);
		return result;
	}

}