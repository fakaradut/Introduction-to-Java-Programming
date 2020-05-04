package chapter08;

import java.util.Scanner;

public class Exercise08_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3:");
		double [][]points=new double[3][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0]=input.nextDouble();
			points[i][1]=input.nextDouble();
		}
		
		System.out.println(getTriangleArea(points)==0.?"The three points are on the same line":"Area: "+getTriangleArea(points));
	}

	public static double getTriangleArea(double[][] points) {
		double x1 = points[0][0];
		double y1 = points[0][1];
		double x2 = points[1][0];
		double y2 = points[1][1];
		double x3 = points[2][0];
		double y3 = points[2][1];
		return (1. / 2) * Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1);
	}
}
