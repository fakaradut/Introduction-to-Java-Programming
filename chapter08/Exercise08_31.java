package chapter08;

import java.util.Scanner;

public class Exercise08_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1");
		double[][] a = new double[4][2];
		for (int i = 0; i < a.length; i++) {
			if (i != 0) {
				System.out.println("Enter x" + (i + 1) + ", y" + (i + 1));
			}
			a[i][0] = input.nextDouble();
			a[i][1] = input.nextDouble();
		}
		double[] intersectionPoint = getIntersectingPoint(a);
		if (getIntersectingPoint(a) != null) {
			intersectionPoint[0] = (int) (intersectionPoint[0] * 10_000) / 10_000.;
			intersectionPoint[1] = (int) (intersectionPoint[1] * 10_000) / 10_000.;
		}
		System.out.println(intersectionPoint == null ? "There is no intersection point"
				: "The intersection point is: (" + intersectionPoint[0] + "," + intersectionPoint[1] + ")");
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double[] point = new double[2];

		double a = points[0][1] - points[1][1];
		double b = -1 * (points[0][0] - points[1][0]);
		double c = points[2][1] - points[3][1];
		double d = -1 * (points[2][0] - points[3][0]);
		double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

		double disc = a * d - b * c;
		point[0] = (e * d - b * f) / disc;
		point[1] = (a * f - e * c) / disc;

		return disc == 0 ? null : point;
	}
}
