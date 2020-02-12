package chapter05;

import java.util.Scanner;

public class Exercise05_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"enter an amount (e.g., 100), the annual interest rate (e.g., 5), and the number of months (e.g., 6): ");
		double amount = input.nextDouble();
		double annualInterestRate = input.nextDouble();

		int month = input.nextInt();
		double savingAmount = 0;

		for (int i = 1; i <= month; i++) {
			savingAmount = (amount + savingAmount) * (1 + annualInterestRate / 1200.);
			System.out.println(savingAmount);
		}

	}
}
