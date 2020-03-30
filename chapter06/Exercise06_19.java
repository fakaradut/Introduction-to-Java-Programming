package chapter06;

import java.util.Scanner;

public class Exercise06_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if (isValid(side1, side2, side3)) {
			System.out.println(area(side1, side2, side3));
		}else {
			System.out.println("Input is invalid");
		}
	}

	public static boolean isValid(double side1, double side2, double side3) {
		boolean isValid = true;

		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
			return isValid = false;
		}

		return isValid;
	}

	public static double area(double side1, double side2, double side3) {
		double r = (side1 + side2 + side3) / 2;
		return Math.sqrt(r * (r - side1) * (r - side2) * (r - side3));
	}
}
