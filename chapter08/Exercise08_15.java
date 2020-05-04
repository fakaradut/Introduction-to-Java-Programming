package chapter08;

import java.util.Scanner;

public class Exercise08_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five points: ");
		double[][] points = new double[5][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		if (sameLine(points)) {
			System.out.println("The five points are on the same line");
		} else {
			System.out.println("The five points are not on the same line");
		}
	}

	public static double[][] findMaxDistancePoints(double[][] points) {
		double maxDistance = Double.MIN_VALUE;
		int firstPointIndex = -1;
		int secondPointIndex = -1;
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = Math
						.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
				if (distance > maxDistance) {
					maxDistance = distance;
					firstPointIndex = i;
					secondPointIndex = j;
				}
			}
		}
		double[][] pointPair = new double[2][2];
		pointPair[0][0] = points[firstPointIndex][0];
		pointPair[0][1] = points[firstPointIndex][1];
		pointPair[1][0] = points[secondPointIndex][0];
		pointPair[1][1] = points[secondPointIndex][1];
		return pointPair;
	}

	public static boolean sameLine(double[][] points) {
		// return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
		double[][] pointPair = findMaxDistancePoints(points);
		double x0 = pointPair[0][0];
		double x1 = pointPair[0][1];
		double y0 = pointPair[1][0];
		double y1 = pointPair[1][1];

		for (int i = 0; i < pointPair.length; i++) {
			double x2 = points[i][0];
			double y2 = points[i][1];
			if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) != 0) {
				return false;
			}
		}
		return true;
	}

}
