package chapter08;

import java.util.Scanner;

public class Exercise08_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		getAreas(points);
	}

	public static void getAreas(double[][] points) {
		double[] upPoint = findUpPoint(points);
		double[] downPoint = findDownPoint(points);
		double[] leftPoint = findLeftPoint(points);
		double[] rightPoint = findRightPoint(points);

		points[0] = upPoint;
		points[1] = downPoint;
		points[2] = leftPoint;
		points[3] = rightPoint;

		System.out.print("The areas are: ");
		double[] intersectionPoint = getIntersectingPoint(points);
		double[][] triangle = new double[3][];
		triangle[0] = intersectionPoint;
		triangle[1] = upPoint;
		triangle[2] = leftPoint;
		double area = getTriangleArea(triangle);
		System.out.printf("%4.2f", area);

		triangle[0] = intersectionPoint;
		triangle[1] = downPoint;
		triangle[2] = leftPoint;
		area = getTriangleArea(triangle);
		System.out.printf("\n%4.2f", area);

		triangle[0] = intersectionPoint;
		triangle[1] = rightPoint;
		triangle[2] = downPoint;
		area = getTriangleArea(triangle);
		System.out.printf("\n%4.2f", area);

		triangle[0] = intersectionPoint;
		triangle[1] = upPoint;
		triangle[2] = rightPoint;
		area = getTriangleArea(triangle);
		System.out.printf("\n%4.2f", area);
	}

	private static double[] findUpPoint(double[][] a) {
		double max = Double.MIN_VALUE;
		int upperIndex = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i][1] > max) {
				max = a[i][1];
				upperIndex = i;
			}
		}
		return a[upperIndex];
	}

	private static double[] findDownPoint(double[][] a) {
		double min = Double.MAX_VALUE;
		int downIndex = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i][1] < min) {
				min = a[i][1];
				downIndex = i;
			}
		}
		return a[downIndex];
	}

	private static double[] findLeftPoint(double[][] a) {
		double left = Double.MAX_VALUE;
		int leftIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i][0] < left) && !(a[i] == findUpPoint(a) || a[i] == findDownPoint(a))) {
				left = a[i][0];
				leftIndex = i;
			}
		}
		return a[leftIndex];
	}

	private static double[] findRightPoint(double[][] a) {
		double right = Double.MIN_VALUE;
		int rightIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] > right && !(a[i] == findUpPoint(a) || a[i] == findDownPoint(a))) {
				right = a[i][0];
				rightIndex = i;
			}
		}
		return a[rightIndex];
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

	public static double getTriangleArea(double[][] points) {
		double x1 = points[0][0];
		double y1 = points[0][1];
		double x2 = points[1][0];
		double y2 = points[1][1];
		double x3 = points[2][0];
		double y3 = points[2][1];
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

}
