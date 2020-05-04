package chapter08;

public class Exercise08_14 {
	public static void main(String[] args) {
		int[][] matrix = getMatrix(4);
		printMatrix(matrix);
		checkRow(matrix);
		checkColumn(matrix);
		checkDiagonals(matrix);
	}

	public static int[][] getMatrix(int size) {
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void checkRow(int[][] list) {
		boolean isAnyPrintOneOfRow = false;
		boolean isAnyPrintZeroOfRow = false;
		for (int i = 0; i < list.length; i++) {
			boolean isAllZero = true;
			boolean isAllOne = true;
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == 1) {
					isAllZero = false;
				} else if (list[i][j] == 0) {
					isAllOne = false;
				}
			}
			if (isAllOne == true) {
				isAnyPrintOneOfRow = true;
				System.out.println("All is 1s on row " + i);
			} else if (isAllZero == true) {
				isAnyPrintZeroOfRow = true;
				System.out.println("All is 0s on row " + i);
			}
		}
		if (isAnyPrintOneOfRow == false && isAnyPrintZeroOfRow == false) {
			System.out.println("No same number on a row");
		}

	}

	public static void checkColumn(int[][] list) {
		boolean isAnyPrintOneOfColumn = false;
		boolean isAnyPrintZeroOfColumn = false;

		for (int column = 0; column < list.length; column++) {
			boolean isAllZero = true;
			boolean isAllOne = true;
			for (int row = 0; row < list[column].length; row++) {
				if (list[row][column] == 1) {
					isAllZero = false;
				} else if (list[row][column] == 0) {
					isAllOne = false;
				}
			}
			if (isAllOne == true) {
				isAnyPrintOneOfColumn = true;
				System.out.println("All is 1s on column " + column);
			} else if (isAllZero == true) {
				isAnyPrintZeroOfColumn = true;
				System.out.println("All is 0s on column " + column);
			}
		}
		if (isAnyPrintOneOfColumn == false && isAnyPrintZeroOfColumn == false) {
			System.out.println("No same number on a column");
		}

	}

	public static void checkDiagonals(int[][] list) {
		boolean isMajorAllZero = true;
		boolean isMajorAllOne = true;
		boolean isSubAllZero = true;
		boolean isSubAllOne = true;
		for (int j = 0, i = list.length - 1; j < list.length; j++, i--) {
			if (list[j][j] == 0) {
				isMajorAllOne = false;
			}
			if (list[j][j] == 1) {
				isMajorAllZero = false;
			}
			if (list[j][i] == 1) {
				isSubAllZero = false;
			}
			if (list[j][i] == 0) {
				isSubAllOne = false;
			}
		}
		if (isMajorAllOne == true) {
			System.out.println("All is 1s on the major diagonal");
		}
		if (isMajorAllZero == true) {
			System.out.println("All is 0s on the major diagonal");
		}
		if (isMajorAllOne == false && isMajorAllZero == false) {
			System.out.println("No same number on major diagonal");
		}
		if (isSubAllOne == true) {
			System.out.println("All is 1s on the sub diagonal");
		}
		if (isSubAllZero == true) {
			System.out.println("All is 0s on the sub diagonal");
		}
		if (isSubAllOne == false && isSubAllZero == false) {
			System.out.println("No same number on sub diagonal");
		}
	}
}
