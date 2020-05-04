package chapter08;

import java.util.Scanner;

public class Exercise08_24 {
	public static void main(String[] args) {
		int[][] sudoku = getSudokuMatrix();
		System.out.println(isValid(sudoku) ? "Valid " : "Invalid" + " sudoku solution");
	}

	public static int[][] getSudokuMatrix() {
		int[][] matrix = new int[9][9];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sudoku matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}

	public static boolean isValid(int[][] matrix) {
		return (rowCheck(matrix) && columnCheck(matrix)) && boxCheck(matrix);
	}

	public static boolean rowCheck(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int[] list = new int[9];
			for (int j = 0; j < matrix[i].length; j++) {
				list[j] = matrix[i][j];
			}
			if (!is1to9(list)) {
				return false;
			}
		}
		return true;
	}

	public static boolean boxCheck(int[][] matrix) {
		for (int row = 0; row < matrix.length; row += 3) {
			for (int column = 0; column < matrix[row].length; column += 3) {
				int[] list = new int[9];
				int index = 0;
				for (int i = row; i < row + 3; i++) {
					for (int j = column; j < column + 3; j++) {
						list[index] = matrix[i][j];
						index++;
					}
				}
				if (!is1to9(list)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean columnCheck(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int[] list = new int[9];
			for (int j = 0; j < matrix.length; j++) {
				list[j] = matrix[j][i];
			}
			if (!is1to9(list)) {
				return false;
			}
		}
		return true;
	}

	public static boolean is1to9(int[] array) {
		boolean[] numbers = new boolean[array.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[array[i] - 1] = true;
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != true) {
				return false;
			}
		}
		return true;
	}
}
