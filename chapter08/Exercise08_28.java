package chapter08;

import java.util.Scanner;

public class Exercise08_28 {
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
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
