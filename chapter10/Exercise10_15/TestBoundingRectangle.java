package chapter10.Exercise10_15;

import java.util.Scanner;

public class TestBoundingRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five points: ");
		double[][] points = new double[5][2];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		MyRectangle2D r1 = getRectangle(points);
		System.out.println("Rectangle height: " + r1.getHeight() + "\nRectangle width: " + r1.getWidth());
		System.out.println("Rectangle center: (" + r1.getX() + "," + r1.getY() + ")");

	}

	public static MyRectangle2D getRectangle(double[][] points) {
		double minX = Double.MAX_VALUE;
		double maxX = Double.MIN_VALUE;
		double minY = Double.MAX_VALUE;
		double maxY = Double.MIN_VALUE;

		for (int i = 0; i < points.length; i++) {
			if (points[i][0] > maxX) {
				maxX = points[i][0];
			}
			if (points[i][0] < minX) {
				minX = points[i][0];
			}
			if (points[i][1] > maxY) {
				maxY = points[i][1];
			}
			if (points[i][1] < minY) {
				minY = points[i][1];
			}
		}
		return new MyRectangle2D((maxX + minX) / 2., (maxY + minY) / 2., (maxX - minX), (maxY - minY));
	}
}
