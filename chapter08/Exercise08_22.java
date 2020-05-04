package chapter08;

public class Exercise08_22 {
	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		display(matrix);
		int evenCount = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (isColumnEven(matrix, i) && isRowEven(matrix, i)) {
				evenCount++;
			}
		}
		if (evenCount == 6) {
			System.out.println("All rows and columns are even");
		} else {
			System.out.println("All rows and columns are not even");
		}
	}

	private static void display(int[][] matrix) {
		for (int[] is : matrix) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
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
