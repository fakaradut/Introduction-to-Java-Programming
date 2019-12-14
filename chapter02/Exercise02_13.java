package chapter02;

import java.util.Scanner;

public class Exercise02_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double monthlySavingAmount = input.nextDouble();

		double totalValue = 100 * (1 + 0.00417);
		totalValue = (monthlySavingAmount + totalValue) * (1 + 0.00417);
		totalValue = (monthlySavingAmount + totalValue) * (1 + 0.00417);
		totalValue = (monthlySavingAmount + totalValue) * (1 + 0.00417);
		totalValue = (monthlySavingAmount + totalValue) * (1 + 0.00417);
		totalValue = (monthlySavingAmount + totalValue) * (1 + 0.00417);
		System.out.println("After the sixth month, the account value is $" + totalValue);
	}
}
