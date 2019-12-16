package chapter04;

import java.util.Scanner;

public class Exercise04_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount: ");
		String amountStringType = input.nextLine();

		int decimal = amountStringType.indexOf('.');
		int amount;

		if (decimal == -1) {
			amount = Integer.parseInt(amountStringType);
		} else {
			String fraction = amountStringType.substring(decimal + 1);

			if (fraction.length() >= 2) {
				fraction = fraction.substring(0, 2);
			} else if (fraction.length() == 1) {
				fraction += "0";
			} else {
				fraction += "00";
			}
			String newAmount = amountStringType.substring(0, decimal) + fraction;

			amount = Integer.parseInt(newAmount);
		}

		int remainingAmount = amount;

		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amountStringType + " consists of \n" + "\t" + numberOfOneDollars + " dollars\n"
				+ "\t" + numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickels
				+ " nickels\n" + "\t" + numberOfPennies + " pennies");
	}
}
