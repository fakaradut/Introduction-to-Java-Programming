package chapter07;

import java.util.Scanner;

public class Exercise07_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[] = new double[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the number: ");
			array[i] = input.nextInt();
		}
		System.out.println(average(array));
	}

	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}
}
