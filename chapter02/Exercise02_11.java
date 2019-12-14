package chapter02;

import java.util.Scanner;

public class Exercise02_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int numberOfYears = input.nextInt();

		System.out.println("The population in 5 years is "
				+ (312032486 + (numberOfYears * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)))));
	}
}
