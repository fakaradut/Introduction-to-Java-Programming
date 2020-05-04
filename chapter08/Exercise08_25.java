package chapter08;

import java.util.Scanner;

public class Exercise08_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix: ");
		double m[][] = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		System.out.println(isMarkovMatrix(m));
	}

	public static boolean isMarkovMatrix(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			double sum = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] < 0) {
					return false;
				}
				sum += m[j][i];
			}
			if (sum != 1) {
				return false;
			}
		}
		return true;
	}
}
