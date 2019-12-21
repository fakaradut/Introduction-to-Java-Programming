package chapter09.Exercise09_11;

import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f in the equation");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

		
	}
}
