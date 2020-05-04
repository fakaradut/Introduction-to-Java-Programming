package chapter08;

public class Exercise08_10 {
	public static void main(String[] args) {
		final int N = 4;
		int[][] matrix = new int[N][N];
		randomMatrix(matrix);
		printMatrix(matrix);
		displayMaxRowAndColumn(matrix);
	}

	public static int[][] randomMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void displayMaxRowAndColumn(int[][] matrix) {
		int maxRow = -1;
		int maxRowIndex = -1;
		for (int row = 0; row < matrix.length; row++) {
			int rowCount = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				rowCount += matrix[row][column] == 1 ? 1 : 0;
			}
			if (maxRow < rowCount) {
				maxRowIndex = row;
				maxRow = rowCount;
			}
		}
		System.out.println("Highest row index: " + maxRowIndex);

		int maxColumn = -1;
		int maxColumnIndex = -1;
		for (int column = 0; column < matrix.length; column++) {
			int columnCount = 0;
			for (int row = 0; row < matrix.length; row++) {
				columnCount += matrix[row][column] == 1 ? 1 : 0;
			}
			if (maxColumn < columnCount) {
				maxColumnIndex = column;
				maxColumn = columnCount;
			}
		}
		System.out.println("Highest column index: " + maxColumnIndex);

	}
}
