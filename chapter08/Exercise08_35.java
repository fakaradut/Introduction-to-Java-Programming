package chapter08;

import java.util.Scanner;

public class Exercise08_35 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows int the matrix: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Enter the matrix row by row: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		int[] list = findLargestBlock(matrix);
		System.out.println(
				"The maximum square submatrix is at (" + list[0] + "," + list[1] + ")" + " with size " + list[2]);
	}

	public static int[] findLargestBlock(int[][] m) {
		int[] a = new int[3];
		int[] row = new int[m.length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					row[i] = j;
				}
			}

		}

		int rowMax = m.length;
		int rowIndex=-1;
		for (int i = 0; i < row.length; i++) {
			if (row[i] < rowMax) {
				rowMax = row[i];
			rowIndex=i;
			}
		}
		a[0] = rowIndex;
		a[1]=rowIndex;
		a[2] = m.length - rowMax-1;

		return a;
	
}}
