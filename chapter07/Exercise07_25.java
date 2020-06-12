package chapter07;

import java.util.Scanner;

public class Exercise07_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values a,b,c: ");
		double[] array = new double[3];
		array[0] = input.nextDouble();
		array[1] = input.nextDouble();
		array[2] = input.nextDouble();
		double[] roots = new double[2];

		solveQuadratic(array, roots);
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		double discriminant = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);

		if (discriminant > 0) {
			System.out.println("Number of reel roots: 2");
			System.out.println("Root one: " + ((-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0])));
			System.out.println("Root two: " + ((-eqn[1] - Math.sqrt(discriminant)) / (2 * eqn[0])));
			return 2;
		} else if (discriminant == 0) {
			System.out.println("Number of reel roots: 1");
			System.out.println(((-eqn[1] + Math.sqrt(discriminant))) / (2 * eqn[0]));
			return 1;
		} else {
			System.out.println("There is no reel roots");
			return 0;
		}
	}
}
