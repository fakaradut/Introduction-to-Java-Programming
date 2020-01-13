package chapter07;

import java.util.Scanner;

public class Exercise07_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_LENGTH = 10;
		double array[] = new double[ARRAY_LENGTH];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number: ");
			array[i] = input.nextDouble();
		}
		System.out.println("The standard deviation is " + deviation(array));
		System.out.println("The mean is " + mean(array));
	}

	public static double deviation(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += Math.pow((x[i] - mean(x)), 2);
		}

		return Math.sqrt(sum / (x.length - 1));
	}

	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;
	}
}
