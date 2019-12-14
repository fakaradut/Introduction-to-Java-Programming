package chapter03;

import java.util.Scanner;

public class Exercise03_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double xOfRentangleCenter = 0;
		double yOfRentangleCenter = 0;
		double heigthOfRectangle = 5;
		double widthOfRectangle = 10;

		if (xOfRentangleCenter - (widthOfRectangle / 2) <= x && x <= xOfRentangleCenter + (widthOfRectangle / 2)) {
			if (yOfRentangleCenter - (heigthOfRectangle / 2) <= y
					&& y <= yOfRentangleCenter + (heigthOfRectangle / 2)) {
				System.out.print("Point (" + x + "," + y + ") is in the rectangle.");
			} else {
				System.out.print("Point (" + x + "," + y + ") is not in the rectangle.");
			}
		} else {
			System.out.print("Point (" + x + "," + y + ") is not in the rectangle.");
		}
	}
}
