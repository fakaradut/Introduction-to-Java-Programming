package chapter08;

import java.util.Scanner;

public class Sudoku {
	public static void main(String[] args) {
	/*int [][]sudokuSample=
		   {{5, 3, 4, 6, 7, 8, 9, 1, 2},
			{6, 7, 2, 1, 9, 5, 3, 4, 8},
			{1, 9, 8, 3, 4, 2, 5, 6, 7},
			{8, 5, 9, 7, 6, 1, 4, 2, 3},
			{4, 2, 6, 8, 5, 3, 7, 9, 1},
			{7, 1, 3, 9, 2, 4, 8, 5, 6},
			{9, 6, 1, 5, 3, 7, 2, 8, 4},
			{2, 8, 7, 4, 1, 9, 6, 3, 5},
			{3, 4, 5, 2, 8, 6, 1, 7, 9}};

		System.out.println(isValid(sudokuSample));
		*/
		
		int[][] grid = readASolution();
		/*
		 * 9 6 3 1 7 4 2 5 8
			1 7 8 3 2 5 6 4 9
			2 5 4 6 8 9 7 3 1
			8 2 1 4 3 7 5 9 6
			4 9 6 8 5 2 3 1 7
			7 3 5 9 6 1 8 2 4
			5 8 9 7 1 3 4 6 2
			3 1 7 2 4 6 9 8 5
			6 4 2 5 9 8 1 7 3
		*/
		System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
	}

		
	public static int[][] readASolution() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Sudoku puzzle solution:");
		int[][] grid = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();

		return grid;

	}

	public static boolean isValid(int[][] list) {
		// before control rows and columns we check the values
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (9 < list[i][j] || list[i][j] <= 0) {
					return false;
				}
			}
		}
		// for rows
		for (int i = 0; i < list.length; i++) {
			int[] numbers = new int[9];
			for (int j = 0; j < list[i].length; j++) {
				numbers[list[i][j] - 1]++;
			}
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] != 1) {
					return false;
				}
			}
		}
		// for columns
		for (int i = 0; i < list.length; i++) {
			int[] numbers = new int[9];
			for (int j = 0; j < list[i].length; j++) {
				numbers[list[j][i] - 1]++;
			}
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] != 1) {
					return false;
				}
			}
		}
		// for small every box
		for (int row = 0; row < list.length; row += 3) {
			for (int column = 0; column < list[row].length; column += 3) {
				if (smallBoxCheck(list, row, column) == false) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean smallBoxCheck(int[][] list, int row, int column) {
		boolean[] isValid = new boolean[9];
		
		for (int i = row ; i < row+3; i++) {
			for (int j = column; j < column + 3; j++) {
				isValid[list[i][j] - 1] = true;
			}
		}
		for (boolean b : isValid) {
			if (b == false) {
				return false;
			}
		}

		return true;
	}
}
