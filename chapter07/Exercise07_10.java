package chapter07;

import java.util.Scanner;

public class Exercise07_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[] = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter number: ");
			array[i] = input.nextDouble();
		}
		System.out.println(indexOfSmallestElement(array));
	}

	public static int indexOfSmallestElement(double[] array) {
		int index = 0;
		double min = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min=array[i];
				index = i;
			}
		}
		return index;
	}
}
