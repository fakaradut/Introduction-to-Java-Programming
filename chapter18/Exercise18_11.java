package chapter18;

import java.util.Scanner;

public class Exercise18_11 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.print("Enter an integer: ");
			long n = input.nextLong();

			System.out.println("The sum of " + n + " = " + sumDigits(n));
		}
	}

	public static int sumDigits(long n) {
		int sum = 0;
		if (n > 0)
			sum += sumDigits(n / 10) + n % 10;
		return sum;
	}
}
