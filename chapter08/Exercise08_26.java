package chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix: ");
		double m[][] = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		double[][] newList = sortRows(m);
		for (double[] ds : newList) {
			for (double ds2 : ds) {
				System.out.print(ds2 + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] m) {
		double[][] newList = new double[m.length][];
		for (int i = 0; i < m.length; i++) {
			newList[i] = new double[m[i].length];
			for (int j = 0; j < m[i].length; j++) {
				newList[i][j] = m[i][j];
			}Arrays.sort(newList[i]);
		}
	

		return newList;
	}
}
