package chapter08;

import java.util.Scanner;

public class Exercise08_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix by row:");
		double list[][] = new double[4][4];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(list));
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
}
