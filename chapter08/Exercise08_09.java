<<<<<<< HEAD
package chapter08;

import java.util.Scanner;

public class Exercise08_09 {
	public static void main(String[] args) {
		ticTacToe();
	}

	public static void ticTacToe() {
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = -1;
			}
		}
		Scanner input = new Scanner(System.in);
		boolean isFinish = false;
		int player = 1;
		printGame(matrix);
		while (!isFinish) {
			int row = -1;
			int column = -1;
			if (player == 1) {
				System.out.println("Enter a row (0,1,2) for player X: ");
				row = input.nextInt();
				System.out.println("Enter a column (0,1,2) for player X: ");
				column = input.nextInt();
			} else {
				System.out.println("Enter a row (0,1,2) for player O: ");
				row = input.nextInt();
				System.out.println("Enter a column (0,1,2) for player O: ");
				column = input.nextInt();
			}
			if (isValid(row, column, matrix, player)) {
				player = player % 2 + 1;
			}
			if (isWon(matrix, player % 2 + 1)) {
				isFinish = true;
			}
			printGame(matrix);
		}
		if (player % 2 + 1 == 1) {
			System.out.println("Player is X won");
		} else {
			System.out.println("Player is O won");
		}
	}

	public static void printGame(int[][] matrix) {

		System.out.println("--------------");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" ");
				if (matrix[i][j] == 1) {
					System.out.print("X");
				} else if (matrix[i][j] == 2) {
					System.out.print("O");
				} else {
					System.out.print(" ");
				}
				System.out.print(" |");
			}
			System.out.println("\n--------------");
		}
	}

	public static boolean isValid(int row, int column, int[][] matrix, int player) {
		if (row < 0 || matrix.length <= row) {
			System.out.println("This (" + row + "," + column + ") area is invalid");
			return false;
		}
		if (column < 0 || matrix.length <= column) {
			System.out.println("This (" + row + "," + column + ") area is invalid");
			return false;
		}
		if (matrix[row][column] != -1) {
			System.out.println("This area is not empty");
			return false;
		}
		matrix[row][column] = player;
		return true;
	}

	public static boolean isWon(int[][] matrix, int player) {
		if (rowCheck(matrix, player) || columnCheck(matrix, player) || diagonalCheck(matrix, player)) {
			return true;
		}
		return false;
	}

	public static boolean rowCheck(int[][] matrix, int player) {
		for (int row = 0; row < matrix.length; row++) {
			int trueCount = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == player) {
					trueCount++;
				}
			}
			if (trueCount == 3) {
				return true;
			}
		}
		return false;
	}

	public static boolean columnCheck(int[][] matrix, int player) {

		for (int column = 0; column < matrix.length; column++) {
			int trueCount = 0;
			for (int row = 0; row < matrix[column].length; row++) {
				if (matrix[row][column] == player) {
					trueCount++;
				}
			}
			if (trueCount == 3) {
				return true;
			}
		}
		return false;
	}

	public static boolean diagonalCheck(int[][] matrix, int player) {
		int trueCountMain = 0;
		int trueCountOpposite = 0;
		for (int j = 0, i = 2; j < matrix.length; j++, i--) {
			if (matrix[j][j] == player) {
				trueCountMain++;
			} else if (matrix[i][i] == player) {
				trueCountOpposite++;
			}
		}
		if (trueCountMain == 3 || trueCountOpposite == 3) {
			return true;
		}
		return false;
	}
}
=======
package chapter08;

import java.util.Scanner;

public class Exercise08_09 {
	public static void main(String[] args) {
		ticTacToe();
	}

	public static void ticTacToe() {
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = -1;
			}
		}
		Scanner input = new Scanner(System.in);
		boolean isFinish = false;
		int player = 1;
		printGame(matrix);
		while (!isFinish) {
			int row = -1;
			int column = -1;
			if (player == 1) {
				System.out.println("Enter a row (0,1,2) for player X: ");
				row = input.nextInt();
				System.out.println("Enter a column (0,1,2) for player X: ");
				column = input.nextInt();
			} else {
				System.out.println("Enter a row (0,1,2) for player O: ");
				row = input.nextInt();
				System.out.println("Enter a column (0,1,2) for player O: ");
				column = input.nextInt();
			}
			if (isValid(row, column, matrix, player)) {
				player = player % 2 + 1;
			}
			if (isWon(matrix, player % 2 + 1)) {
				isFinish = true;
			}
			printGame(matrix);
		}
		if (player % 2 + 1 == 1) {
			System.out.println("Player is X won");
		} else {
			System.out.println("Player is O won");
		}
	}

	public static void printGame(int[][] matrix) {

		System.out.println("--------------");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" ");
				if (matrix[i][j] == 1) {
					System.out.print("X");
				} else if (matrix[i][j] == 2) {
					System.out.print("O");
				} else {
					System.out.print(" ");
				}
				System.out.print(" |");
			}
			System.out.println("\n--------------");
		}
	}

	public static boolean isValid(int row, int column, int[][] matrix, int player) {
		if (row < 0 || matrix.length <= row) {
			System.out.println("This (" + row + "," + column + ") area is invalid");
			return false;
		}
		if (column < 0 || matrix.length <= column) {
			System.out.println("This (" + row + "," + column + ") area is invalid");
			return false;
		}
		if (matrix[row][column] != -1) {
			System.out.println("This area is not empty");
			return false;
		}
		matrix[row][column] = player;
		return true;
	}

	public static boolean isWon(int[][] matrix, int player) {
		if (rowCheck(matrix, player) || columnCheck(matrix, player) || diagonalCheck(matrix, player)) {
			return true;
		}
		return false;
	}

	public static boolean rowCheck(int[][] matrix, int player) {
		for (int row = 0; row < matrix.length; row++) {
			int trueCount = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == player) {
					trueCount++;
				}
			}
			if (trueCount == 3) {
				return true;
			}
		}
		return false;
	}

	public static boolean columnCheck(int[][] matrix, int player) {

		for (int column = 0; column < matrix.length; column++) {
			int trueCount = 0;
			for (int row = 0; row < matrix[column].length; row++) {
				if (matrix[row][column] == player) {
					trueCount++;
				}
			}
			if (trueCount == 3) {
				return true;
			}
		}
		return false;
	}

	public static boolean diagonalCheck(int[][] matrix, int player) {
		int trueCountMain = 0;
		int trueCountOpposite = 0;
		for (int j = 0, i = 2; j < matrix.length; j++, i--) {
			if (matrix[j][j] == player) {
				trueCountMain++;
			} else if (matrix[i][i] == player) {
				trueCountOpposite++;
			}
		}
		if (trueCountMain == 3 || trueCountOpposite == 3) {
			return true;
		}
		return false;
	}
}
>>>>>>> 7af1d9968804c80cea04654b9c2daefeb8630261
