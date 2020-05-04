package chapter08;

import java.util.Scanner;

public class Exercise08_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] matrix = new double[row][column];
		System.out.println("Enter the array: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		int minIndex[] = locateLargest(matrix);
		for (int i = 0; i < minIndex.length; i++) {
			System.out.println("The location of the largest element is at (" + minIndex[0] + "," + minIndex[1] + ")");
		}
	}

	public static int[] locateLargest(double[][] a) {
		int index[] = new int[2];
		double max = Double.MIN_VALUE;
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				if (a[row][column] > max) {
					index[0] = row;
					index[1] = column;
					max = a[row][column];
				}
			}
		}
		return index;
	}
}
