package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size n: ");
		final int N = input.nextInt();
		int[][] matrix = new int[N][N];
		System.out.println("The random array: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		for (int[] is : matrix) {
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i]+" ");
			}
			System.out.println();
		}
		ArrayList<Integer> index = new ArrayList<>(2);
		index.add(maxRow(matrix));
		index.add(maxColumn(matrix));

		System.out.println("The largest row index: " + index.get(0));
		System.out.println("The largest column index: " + index.get(1));
	}

	public static int maxRow(int[][] list) {
		int rowSum = 0;
		int index = -1;
		for (int i = 0; i < list.length; i++) {
			int row = 0;
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == 1) {
					row++;
				}
			}
			if (row > rowSum) {
				rowSum = row;
				index = i;
			}
		}
		return index;
	}

	public static int maxColumn(int[][] list) {
		
		int columnSum = 0;
		int index = -1;
		for (int i = 0; i < list.length; i++) {
			int column = 0;
			int temp=0;
			for (int j = 0; j < list[i].length; j++) {
				if (list[j][i] == 1) {
					column++;
				}
				temp=j;
			}
			if (column > columnSum) {
				columnSum = column;
				index = temp;
			}
		}
		return index;
	}
}
