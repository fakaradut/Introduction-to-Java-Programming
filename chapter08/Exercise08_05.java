package chapter08;

import java.util.Scanner;

public class Exercise08_05 {
	// m1 1 2 3 4 5 6 7 8 9
	// m2 0 2 4 1 4,5 2,2 1,1 4,3 5,2
	public static void main(String[] args) {
		double m1[][] = new double[3][3];
		double m2[][] = new double[3][3];
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

		double sumOfMatrix[][] = addMatrix(m1, m2);
		System.out.println("The matrices are added as follows");
		for (int i = 0; i < sumOfMatrix.length; i++) {
			for (int j = 0; j < sumOfMatrix[i].length; j++) {
				System.out.print(sumOfMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] addMatrix(double[][] m1, double[][] m2) {
		double sum[][] = new double[3][3];

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return sum;
	}

}
