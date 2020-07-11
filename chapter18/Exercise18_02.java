package chapter18;

import java.util.Scanner;

public class Exercise18_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();

		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));

	}

	public static long fib(long index) {
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;

		if (index == 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		} else {
			for (int i = 1; i < index; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
			return currentFib;
		}
	}

}
