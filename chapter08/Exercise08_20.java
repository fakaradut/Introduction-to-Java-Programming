package chapter08;

import java.util.Scanner;

public class Exercise08_20 {
	public static void main(String[] args) {
		final int ROW = 6;
		final int COLUMN = 7;
		int[][] matrix = new int[ROW][COLUMN];
		Scanner input = new Scanner(System.in);
		displayGame(matrix);
		int turn = 0;
		while (!isConsecutiveFour(matrix)) {
			System.out.println("Drop a " + (turn % 2 == 0 ? "red " : "yellow ") + "at column (0-6): ");
			int disk = input.nextInt();
			if (isValid(matrix, turn, disk)) {
				turn++;
			}
			displayGame(matrix);
		}
		if (turn % 2 == 1) {
			System.out.println("The red player won");
		} else {
			System.out.println("The yellow player won");
		}
	}

	public static boolean isValid(int[][] matrix, int player, int number) {
		if (number < 0 || 6 < number) {
			System.out.println("Invalid input. Try again.");
			return false;
		}
		int columnHeight = 0;
		for (int i = matrix.length - 1; 0 <= i; i--) {
			if (matrix[i][number] == 0) {
				matrix[i][number] = player % 2 == 0 ? 1 : -1;
				break;
			}
			columnHeight++;
		}
		if (columnHeight == matrix.length) {
			System.out.println(number + ". column is full try different column");
			return false;
		}
		return true;
	}

	public static boolean isConsecutiveFour(int[][] matrix) {

		return checkColumn(matrix) || checkRow(matrix) || checkDiagonals(matrix);
	}

	public static boolean checkRow(int[][] matrix) {
		int rowNumber = matrix[0][0];

		for (int row = 0; row < matrix.length; row++) {
			int rowCount = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] != 0) {
					if (rowNumber == matrix[row][column]) {
						rowCount++;
					} else if (rowCount < 4 && rowNumber != matrix[row][column]) {
						rowNumber = matrix[row][column];
						rowCount = 1;
					}
				}
			}
			if (rowCount >= 4) {

				return true;
			}
		}
		return false;
	}

	public static boolean checkColumn(int[][] matrix) {
		int columnNumber = matrix[0][0];

		for (int column = 0; column < matrix.length; column++) {
			int rowCount = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][column] != 0) {
					if (columnNumber == matrix[row][column]) {
						rowCount++;
					} else if (rowCount < 4 && columnNumber != matrix[row][column]) {
						columnNumber = matrix[row][column];
						rowCount = 1;
					}
				}
			}
			if (rowCount >= 4) {

				return true;
			}
		}
		return false;
	}

	private static boolean checkDiagonals(int[][] matrix) {

		return checkMajor(matrix) || checkSub(matrix);
	}

	public static boolean checkMajor(int[][] matrix) {
		for (int row = 0; row < matrix.length - 2; row++) {
			for (int column = 0; column < matrix[row].length - 1; column++) {
				if (matrix[row][column] != 0) {
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

							return true;
						}
					}

					row = tempRow;
					column = tempColumn;
				}

			}
		}
		return false;
	}

	public static boolean checkSub(int[][] matrix) {

		for (int row = matrix.length - 1; 0 < row; row--) {
			for (int column = 0; column < matrix[row].length - 1; column++) {
				if (matrix[row][column] != 0) {
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

							return true;
						}
					}

					row = tempRow;
					column = tempColumn;
				}
			}

		}
		return false;
	}

	public static void displayGame(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					System.out.print("R|");
				} else if (matrix[i][j] == -1) {
					System.out.print("Y|");
				} else {
					System.out.print(" |");
				}
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
}
