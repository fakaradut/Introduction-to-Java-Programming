package chapter03;

import java.util.Scanner;

public class Exercise03_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (three digits):");
		int lottery = (int) (Math.random() * 900) + 100;
		System.out.println("Lottery is: " + lottery);
		int guess = input.nextInt();

		int num1 = (lottery - (lottery % 100)) / 100;
		int num2 = (lottery - num1 * 100) / 10;
		int num3 = lottery % 10;

		if (guess == (num1 * 100 + num2 * 10 + num3)) {
			System.out.println("Exact match: you win $10,000");
		} else if (guess == (num1 * 100 + num2 * 10 + num3) || guess == (num3 * 100 + num2 * 10 + num1)
				|| guess == (num1 * 100 + num3 * 10 + num1) || guess == (num3 * 100 + num1 * 10 + num2)
				|| guess == (num2 * 100 + num1 * 10 + num3) || guess == (num2 * 100 + num2 * 10 + num1)) {
			System.out.println("Match all digits: you win $3,000");
		} else if ((guess % 10 == num1) || (guess % 10 == num2) || (guess % 10 == num3)
				|| ((guess % 100) - guess % 10) / 10 == num1 || ((guess % 100) - guess % 10) / 10 == num2
				|| ((guess % 100) - guess % 10) / 10 == num3 || (guess - (guess % 100)) / 100 == num1
				|| (guess - (guess % 100)) / 100 == num2 || (guess - (guess % 100)) / 100 == num3) {
			System.out.println("Match one digit: you win $1,000");
		} else {
			System.out.println("Sorry: no match");
		}
	}
}
