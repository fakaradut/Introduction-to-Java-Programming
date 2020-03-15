package chapter06;

import java.util.Scanner;

public class Exercise06_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the investment amount (e.g.,1000) and the annual interest rate (e.g., 9) ");
		double amount = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		int year = 30;
		double monthlyInterestRate = annualInterestRate / 1_200;

		System.out.println(futureInvestmentValue(amount, monthlyInterestRate, year));
		printThirtyTimesInvestment(amount, monthlyInterestRate);

	}

	public static void printThirtyTimesInvestment(double amount, double monthlyInterestRate) {
		System.out.printf("%-8s%-10s\n", "Years", "Future Value");
		for (int year = 1; year <= 30; year++) {
			System.out.printf("%-8d%-10.2f\n", year, futureInvestmentValue(amount, monthlyInterestRate, year));
		}

	}

	public static double futureInvestmentValue(double amount, double monthlyInterestRate, int year) {

		double equation = amount * Math.pow(1 + monthlyInterestRate, year * 12);

		return (int) (equation * 100) / 100.;
	}

}
