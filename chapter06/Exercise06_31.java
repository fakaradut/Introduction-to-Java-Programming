package chapter06;

import java.util.Scanner;

public class Exercise06_31 {
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();

		System.out.println(isValid(number));
		
		

	}

	public static boolean isValid(long number) {
		boolean isValid = 13 <= getSize(number) && getSize(number) <= 16;
		isValid = (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6)
				|| prefixMatched(number, 37))&&(sumOfDoubleEvenPlace(number) + sumOfOddPlace(number) % 10 == 0);
		
		return isValid;

	}

	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, d) == d;
	}

	public static long getPrefix(long number, int k) {
		String prefix = "";
		String str = number + "";
		for (int i = 0; i < getSize(k); i++) {
			prefix += str.charAt(i);
		}
		return Long.parseLong(prefix);

	}

	public static int getSize(long number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		number = number / 10;

		while (number != 0) {
			sum += getDigit((int) (number % 10) * 2);
			number /= 100;
		}

		return sum;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		while (number != 0) {
			sum += (number % 10);
			number /= 100;
		}
		return sum;
	}

	public static int getDigit(int number) {
		if (number / 10 == 0) {
			return number;
		} else {
			return number % 10 + number / 10;
		}
	}
}
