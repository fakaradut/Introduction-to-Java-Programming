package chapter08;

import java.util.Scanner;

public class Exercise08_30 {
	public static void main(String[] args) {
		double[][] a = new double[2][2];
		double[] b = new double[2];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a00, a01, a10, a11, b0, b1: ");
		a[0][0] = input.nextDouble();
		a[0][1] = input.nextDouble();
		a[1][0] = input.nextDouble();
		a[1][1] = input.nextDouble();
		b[0] = input.nextDouble();
		b[1] = input.nextDouble();
		double[] result = linearEquation(a, b);
		System.out.println(result == null ? "The equation has no solution." : "x: " + result[0] + "\ny: " + result[1]);

	}

	public static double[] linearEquation(double[][] a, double[] b) {
		double[] result = new double[2];
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			return null;
		} else {
			double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
			double y = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
			result[0] = x;
			result[1] = y;
		}

		return result;
	}
}
