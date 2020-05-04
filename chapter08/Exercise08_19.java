package chapter08;

import java.util.Scanner;

public class Exercise08_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array rows and columns ");
		int row = input.nextInt();
		int column = input.nextInt();
		int[][] values = new int[row][column];
		System.out.println("Enter the values ");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				values[i][j] = input.nextInt();
			}
		}
		System.out.println(isConsecutiveFour(values));
	}

	public static boolean isConsecutiveFour(int[][] values) {

		return checkColumn(values) || checkRow(values) || checkDiagonals(values);
	}

	public static boolean checkRow(int[][] values) {
		int rowNumber = values[0][0];

		for (int row = 0; row < values.length; row++) {
			int rowCount = 0;
			for (int column = 0; column < values[row].length; column++) {
				if (rowNumber == values[row][column]) {
					rowCount++;
				} else if (rowCount < 4 && rowNumber != values[row][column]) {
					rowNumber = values[row][column];
					rowCount = 1;
				}
			}
			if (rowCount >= 4) {
				System.out.println("Consecutive four is: " + rowNumber);
				return true;
			}
		}
		return false;
	}

	public static boolean checkColumn(int[][] values) {
		int columnNumber = values[0][0];

		for (int column = 0; column < values.length; column++) {
			int rowCount = 0;
			for (int row = 0; row < values.length; row++) {
				if (columnNumber == values[row][column]) {
					rowCount++;
				} else if (rowCount < 4 && columnNumber != values[row][column]) {
					columnNumber = values[row][column];
					rowCount = 1;
				}
			}
			if (rowCount >= 4) {
				System.out.println("Consecutive four is: " + columnNumber);
				return true;
			}
		}
		return false;
	}

	private static boolean checkDiagonals(int[][] values) {

		return checkMajor(values) || checkSub(values);
	}

	public static boolean checkMajor(int[][] matrix) {
		for (int row = 0; row < matrix.length - 2; row++) {
			for (int column = 0; column < matrix[row].length - 1; column++) {
				int majorDiagonalNumber = matrix[row][column];
				int tempRow = row;
				int tempColumn = column;
				int majorCount = 1;
				while (majorDiagonalNumber == matrix[row + 1][column + 1]) {
					majorCount++;
					if (row + 1 < matrix.length - 1 && column + 1 < matrix[row + 1].length - 1) {
						row++;
						column++;
					}
					if (majorCount >= 4) {
						System.out.println("Consecutive four is: " + majorDiagonalNumber);
						return true;
					}
				}

				row = tempRow;
				column = tempColumn;
			}

		}
		return false;
	}

	public static boolean checkSub(int[][] matrix) {

		for (int row = matrix.length - 1; 0 < row; row--) {
			for (int column = 0; column < matrix[row].length - 1; column++) {
				int subDiagonalNumber = matrix[row][column];
				int tempRow = row;
				int tempColumn = column;
				int subCount = 1;

				while (subDiagonalNumber == matrix[row - 1][column + 1]) {
					subCount++;
					if (row - 1 > 0 && matrix[row - 1].length > column + 1) {
						row--;
						column++;
					} else if (subCount < 4) {
						break;
					}
					if (subCount >= 4) {
						System.out.println("Consecutive four is: " + subDiagonalNumber);
						return true;
					}
				}

				row = tempRow;
				column = tempColumn;
			}

		}
		return false;
	}
}
