package chapter08;

import java.util.Scanner;

public class Exercise08_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n = input.nextInt();
		char[][] charMatrix = new char[n][n];
		for (int i = 0; i < charMatrix.length; i++) {
			for (int j = 0; j < charMatrix[i].length; j++) {
				char ch = input.next().charAt(0);
				if (isValidChar(ch, n)) {
					charMatrix[i][j] = ch;
				} else {
					j--;
					System.out.println("Wrong input: the letters must be from A to " + (char) (65 + n));
				}
			}
		}
		if (isLatinSquare(charMatrix, n)) {
			System.out.println("The input array is a Latin square");
		}
	}

	private static boolean isValidChar(char ch, int number) {
		if ('A' + (char) (number - 1) < ch || ch < 'A') {
			return false;
		}
		return true;
	}

	public static boolean isLatinSquare(char[][] array, int number) {
		for (int i = 0; i < array.length; i++) {
			int[] row = new int[number];
			for (int j = 0; j < array[i].length; j++) {
				row[(int) (array[i][j]) - 65]++;
			}
			for (int j = 0; j < row.length; j++) {
				if (row[j] == 0) {
					return false;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			int[] column = new int[number];
			for (int j = 0; j < array[i].length; j++) {
				column[(int) (array[i][j]) - 65]++;
			}
			for (int j = 0; j < column.length; j++) {
				if (column[j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
