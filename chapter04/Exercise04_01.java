package chapter04;

import java.util.Scanner;

public class Exercise04_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex: ");
		double s = 2 * Math.sin(Math.PI / 5) * input.nextDouble();

		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		System.out.println("The area of the pentagon is " + area);
	}
}
