package chapter09.Exercise09_12;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter points x1, y1, x2, y2, x3, y3, x4, y4");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

		if (eq.isSolvable()) {
			System.out.printf("(%-7.5f, %-7.5f)", eq.getX(), eq.getY());
		} else {
			System.out.println("The equation has no solution.");
		}
	}
}
