package chapter18;

import java.util.Scanner;

public class Exercise18_12 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.print("Enter a string: ");
			String value = input.nextLine();
			reverseDisplay(value);
		}
	}

	public static void reverseDisplay(String value) {
		reverseDisplay(value, value.length() - 1);
	}

	public static void reverseDisplay(String value, int high) {
		System.out.print(value.charAt(high--));
		if (high >= 0)
			reverseDisplay(value, high);
	}

}
/*
 * (Print the characters in a string reversely) Rewrite Programming Exercise
 * 18.9 using a helper method to pass the substring high index to the method.
 * The helper method header is: public static void reverseDisplay(String value,
 * int high)
 */
