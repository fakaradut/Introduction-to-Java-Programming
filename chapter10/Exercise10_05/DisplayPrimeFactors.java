package chapter10.Exercise10_05;

import java.util.Scanner;

public class DisplayPrimeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number ");
		int number = input.nextInt();
		StackOfIntegers st = new StackOfIntegers();

		factors(number, st);

		for (int i = st.getSize() - 1; 0 <= i; i--) {
			System.out.print(st.peek() + (i!=0?", ":" "));
			st.pop();
		}
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void factors(int number, StackOfIntegers st) {
		// int size = 0;
		// int length = 10;
		// int[] factors = new int[length];
		int factor = 2;

		while (number >= factor) {
			/*
			 * if (number % factor == 0) { if (size >= factors.length) { int[] temp = new
			 * int[size * 2]; System.arraycopy(factors, 0, temp, 0, factors.length);
			 * factors=temp; } factors[size++] = factor;
			 */
			if (number % factor == 0) {
				st.push(factor);
				number /= factor;
				continue;
			}

			for (int i = factor + 1; i <= number; i++) {
				if (isPrime(i)) {
					factor = i;
					break;
				}
			}
		}
	}

	// return factors;

}
