package chapter04;

import java.util.Scanner;

public class Exercise04_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		double a = Math.PI / 2.;
		int side = 5;
		double increase = (2. * Math.PI) / side;

		System.out.println("The coordinates of five points on the pentagon are");

		System.out.println("(" + (radius * Math.cos(a)) + ", " + (radius * Math.sin(a)) + ")");
		a += increase;
		System.out.println("(" + (radius * Math.cos(a)) + ", " + (radius * Math.sin(a)) + ")");
		a += increase;
		System.out.println("(" + (radius * Math.cos(a)) + ", " + (radius * Math.sin(a)) + ")");
		a += increase;
		System.out.println("(" + (radius * Math.cos(a)) + ", " + (radius * Math.sin(a)) + ")");
		a += increase;
		System.out.println("(" + (radius * Math.cos(a)) + ", " + (radius * Math.sin(a)) + ")");

	}
}
