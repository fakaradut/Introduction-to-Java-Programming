package chapter08;

import java.util.Scanner;

public class Exercise08_11 {
	public static void main(String[] args) {
		final int N = 3;
		int[][] matrix = new int[N][N];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number between 0 and 511: ");
		int number = input.nextInt();
		getMatrix(matrix, number);
		printMatrixHeadOrTale(matrix);
		System.out.println(binToHex(matrix));
	}

	public static int[][] getMatrix(int[][] matrix, int number) {

		for (int row = matrix.length - 1; 0 <= row; row--) {
			for (int column = matrix[row].length - 1; 0 <= column; column--) {
				matrix[row][column] = number % 2;
				number /= 2;
			}
		}
		return matrix;
	}

	public static void printMatrixHeadOrTale(int[][] matrix) {
		String str = "";
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				str += matrix[row][column] == 1 ? "T " : "H ";
			}
			if (row != matrix.length - 1) {
				str += "\n";
			}
		}
		System.out.println(str);
	}

	public static int binToHex(int[][] list) {
		int sum = 0;
		for (int i = list.length - 1, count = 0; 0 <= i; i--) {
			for (int j = list[i].length - 1; 0 <= j; j--, count++) {
				sum += Math.pow(2, count) * list[i][j];
			}
		}
		return sum;
	}
}
