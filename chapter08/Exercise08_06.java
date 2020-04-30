package chapter08;

import java.util.Scanner;

public class Exercise08_06 {
	// m1 1 2 3 4 5 6 7 8 9
	// m2 0 2 4 1 4,5 2,2 1,1 4,3 5,2
	public static void main(String[] args) {
		final int matrixSize = 3;
		double m1[][] = new double[matrixSize][matrixSize];
		double m2[][] = new double[matrixSize][matrixSize];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix1:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix2:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = input.nextDouble();
			}
		}

		double multiplyMatrix[][] = multiplyMatrix(m1, m2);
		printMatrix(multiplyMatrix);
	}

	public static double[][] multiplyMatrix(double[][] m1, double[][] m2) {

		double multiply[][] = new double[m1.length][m2[0].length];
		for (int i = 0; i < multiply.length; i++) {
			for (int j = 0; j < multiply[i].length; j++) {
				multiply[i][j] = m1[i][0] * m2[0][j] + m1[i][1] * m2[1][j] + m1[i][2] * m2[2][j];
			}
		}

		return multiply;
	}

	public static void printMatrix(double[][] multiplyMatrix) {
		for (int i = 0; i < multiplyMatrix.length; i++) {
			for (int j = 0; j < multiplyMatrix.length; j++) {
				System.out.printf("%3.1f  ",multiplyMatrix[i][j]);
			}
			System.out.println();
		}
	}

}
