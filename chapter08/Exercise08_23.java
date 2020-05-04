package chapter08;

import java.util.Scanner;

public class Exercise08_23 {
	/*
	 * 1 1 1 0 1 1
     * 1 1 1 1 0 0
     * 0 1 0 1 1 1
     * 1 1 1 1 1 1
     * 0 1 1 1 1 0
	 * 1 0 0 0 0 1
	 */
	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 6-by-6 matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		int column = -1;
		int row = -1;
		for (int i = 0; i < matrix.length; i++) {
			if (!isColumnEven(matrix, i)) {
				column = i;
				break;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			if (!isRowEven(matrix, i)) {
				row = i;
				break;
			}
		}
		System.out.println("The flipped cell is at (" + row + "," + column + ")");
	}

	private static boolean isColumnEven(int[][] matrix, int column) {
		int sum = 0;
		for (int i = 0; i < matrix[column].length; i++) {
			sum += matrix[i][column];
		}
		return sum % 2 == 0 ? true : false;
	}

	private static boolean isRowEven(int[][] matrix, int row) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[row][i];
		}
		return sum % 2 == 0 ? true : false;
	}
}
