package chapter08;

public class Exercise08_01 {
	public static void main(String[] args) {
		double m[][] = { { 1.5, 2, 3, 4 }, { 5.5, 6, 7, 8 }, { 9.5, 1, 3, 1 } };
		printSumColumn(m, 4);
	}

	public static void printSumColumn(double[][] m, int columnLength) {
		for (int i = 0; i < columnLength; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;
	}
}
