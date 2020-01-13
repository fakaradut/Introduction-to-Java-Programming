package chapter07;

import java.util.Scanner;

public class Exercise07_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUMBER_OF_ARRAY = 10;
		double[] array = new double[NUMBER_OF_ARRAY];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number: ");
			array[i] = input.nextDouble();
		}
		reverseArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}

	}

	public static double[] reverseArray(double[] array) {
		for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
			double temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
}
