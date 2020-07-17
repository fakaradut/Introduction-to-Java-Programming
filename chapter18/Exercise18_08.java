package chapter18;

import java.util.Scanner;

public class Exercise18_08 {
	static int size;
	static int sizeWithZero;

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.println("Enter an integer: ");
			int number = input.nextInt();
			size = (number + "").length();
			sizeWithZero = (number + "").length();
			reverseDisplay(number);
		}

	}

	public static void reverseDisplay(int number) {
		if (number > 0) {
			boolean lastDigitIsZero = false;
			int display = number % 10;

			// checking very last digit if it is zero
			if (display == 0 && size == sizeWithZero) {
				sizeWithZero--;
				lastDigitIsZero = true;
			}
			if (display != 0 && size == sizeWithZero) {
				lastDigitIsZero = false;
			}
			
			// we don't print last digit if it is zero
			System.out.print(lastDigitIsZero ? "" : display);
			size--;
			reverseDisplay(number / 10);
		}
	}

}
