package chapter03;

import java.util.Scanner;

public class Exercise03_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = input.nextInt();

		System.out.print("Enter the ");

		if (choice == 0) {
			System.out.print("dollar amount: ");
			double amount = input.nextDouble();
			System.out.println("$" + amount + " is " + (amount * rate) + " yuan");
		} else if (choice == 1) {
			System.out.print("RMB amount: ");
			double amount = input.nextDouble();
			System.out.println(amount + " yuan is $" + ((int) ((amount * 100) / rate)) / 100.0);
		} else {
			System.out.println("Incorrect input");
		}
	}
}
