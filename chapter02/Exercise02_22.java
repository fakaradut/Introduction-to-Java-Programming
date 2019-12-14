package chapter02;

import java.util.Scanner;

public class Exercise02_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in integer, for example 1156 (for 11 dollars and 56 cents) ");
		int amount = input.nextInt();
		int remaining = amount;

		int numOfDollars = remaining / 100;
		remaining = remaining % 100;
		
		int numOfQuarters = remaining / 25;
		remaining = remaining % 25;
		
		int numOfDimes = remaining / 10;
		remaining = remaining % 10;
		
		int numOfNickels = remaining / 5;
		remaining = remaining % 5;
		
		int numOfPennies = remaining;

		System.out.println("Your amount " + (amount / 100.0) + " consists of");
		System.out.println(" " + numOfDollars + " dollars");
		System.out.println(" " + numOfQuarters + " quarters");
		System.out.println(" " + numOfDimes + " dimes");
		System.out.println(" " + numOfNickels + " nickels");
		System.out.println(" " + numOfPennies + " pennies");
	}
}
