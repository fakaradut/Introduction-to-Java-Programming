package chapter03;

import java.util.Scanner;

public class Exercise03_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double, for example 11.56: ");
		int amount = (int) (input.nextDouble() * 100);
		int remain = amount;

		int dollar = remain % 100;
		remain %= 100;

		int quarter = remain % 25;
		remain %= 25;

		int dime = remain % 10;
		remain %= 10;

		int nickel = remain % 5;

		int penny = remain %= 5;

		System.out.println("Your amount " + amount + " consists of");
		System.out.println(dollar + " dollars");
		System.out.println(quarter + " quarters");
		System.out.println(dime + " dimes");
		System.out.println(nickel + " nickels");
		System.out.println(penny + " pennies");
	}
}
