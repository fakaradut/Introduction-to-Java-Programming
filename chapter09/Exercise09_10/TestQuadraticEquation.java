package chapter09.Exercise09_10;

import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c in the equation: ax2 + bx + x = 0");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation equation = new QuadraticEquation(a, b, c);

		if (equation.getDiscriminant() == 0) {
			System.out.println("Root: " + equation.getRoot1());
		} else if (equation.getDiscriminant() < 0) {
			System.out.println("The equation has no roots.");
		} else {
			System.out.println("Root1: " + equation.getRoot1());
			System.out.println("Root2: " + equation.getRoot2());
		}

	}
}
