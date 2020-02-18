package chapter05;

import java.util.Scanner;

public class Exercise05_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter annual percentage yield: ");
		double annualPercentage = input.nextDouble();
		System.out.println("Enter maturity period (number of months): ");
		int month = input.nextInt();
		double result = amount;

		System.out.printf("%-5s%-12s\n", "Month ", "CD Value");
		for (int i = 1; i <= month; i++) {
			result = result + result * (annualPercentage / 1_200.);
			System.out.printf("%-6d%-7.2f\n", i, result);
		}

	}

}
