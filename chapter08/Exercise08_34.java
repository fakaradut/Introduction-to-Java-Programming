package chapter08;

import java.util.Scanner;

public class Exercise08_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[6][2];
		// 1,5 2,5 -3 4,5 5,6 -7 6,5 -7 8 1 10 2,5
		System.out.print("Enter 6 points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		double point[] = getRightmostLowestPoint(points);
		System.out.println("The rightmost lowest point is (" + point[0] + "," + point[1] + ")");
	}

	public static double[] getRightmostLowestPoint(double[][] points) {
		double[] point = new double[2];
		double x = Double.MIN_VALUE;
		double y = Double.MAX_VALUE;
		for (int i = 0; i < points.length; i++) {
			if (points[i][1] == y && x < points[i][0]) {
				y = points[i][1];
				x = points[i][0];
			} else if (points[i][1] < y) {
				y = points[i][1];
				x = points[i][0];
			}
		}
		point[0] = x;
		point[1] = y;

		return point;
	}

}
