package chapter09.Exercise09_13;

import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] list = new double[rows][columns];
		System.out.println("Enter the array: ");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}

		Location location = Location.locateLargest(list);
		int row = location.row;
		int column = location.column;
		double max = location.maxValue;

		System.out.println("The location of the largest element is " + max + " is at (" + row + "," + column + ")");
	}
}
