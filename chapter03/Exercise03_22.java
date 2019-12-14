package chapter03;

import java.util.Scanner;

public class Exercise03_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double xOfCircleCenter = 0;
		double yOfCircleCenter = 0;
		double radius = 10;

		double distance = Math.sqrt(Math.pow(xOfCircleCenter - x, 2) + Math.pow(yOfCircleCenter - y, 2));
		System.out.print("Point (" + x + "," + y + ") is ");
		if (distance <= radius) {
			System.out.println(" in the circle.");
		} else {
			System.out.println(" not int the circle.");
		}
	}
}
