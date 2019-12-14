package chapter03;

import java.util.Scanner;

public class Exercise03_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		double denominator = a * d - b * c;
		if (denominator == 0) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("x is " + (e * d - b * f) / denominator+" y is " + (a * f - e * c) / denominator);
		}

	}
}
