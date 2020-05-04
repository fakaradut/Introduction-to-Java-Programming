package chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter m1: ");
		int m1[][] = new int[3][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter m2: ");
		int m2[][] = new int[3][3];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = input.nextInt();
			}
		}
		System.out.println(equals(m1, m2));
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		int m1Length = 0;
		int m2Length = 0;
		if (m1.length != m2.length) {
			return false;
		}
		for (int i = 0; i < m1.length; i++) {
			m1Length += m1[i].length;
			m2Length += m2[i].length;
		}
		int[] copyM1 = new int[m1Length];
		int[] copyM2 = new int[m2Length];
		int index = 0;
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++, index++) {
				copyM1[index] = m1[i][j];
				copyM2[index] = m2[i][j];
			}
		}
		Arrays.sort(copyM1);
		Arrays.sort(copyM2);
		for (int i = 0; i < copyM2.length; i++) {
			if (copyM1[i] != copyM2[i]) {
				return false;
			}
		}

		return true;
	}

}
