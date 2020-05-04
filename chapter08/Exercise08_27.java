package chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix: ");
		double m[][] = new double[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		double[][] newList = sortColumn(m);
		for (double[] ds : newList) {
			for (double ds2 : ds) {
				System.out.print(ds2 + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortColumn(double[][] m) {
		double[][] newList = new double[m.length][];
		for (int i = 0; i < m.length; i++) {
			newList[i] = new double[m[i].length];
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				newList[j][i] = m[j][i];
			}

			double temp[] = new double[m.length];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = newList[j][i];
			}
			Arrays.sort(temp);
			for (int j = 0; j < temp.length; j++) {
				newList[j][i] = temp[j];
			}
		}
		return newList;
	}
}
