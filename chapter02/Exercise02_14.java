package chapter02;

import java.util.Scanner;

public class Exercise02_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		System.out.println("Enter height in inches: ");
		double heightInInches = input.nextDouble();

		double bmi = (weightInPounds * 0.45359237) / (heightInInches * 0.0254 * 0.0254 *heightInInches  );
		System.out.println("Bmi is " + bmi);
	}
}
