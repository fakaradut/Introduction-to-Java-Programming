package chapter07;

import java.util.Scanner;

public class Exercise07_09 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] array=new double[10];
 		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number: ");
			array[i]=input.nextDouble();
		}
 		
 		System.out.println(min(array));
	}

	public static double min(double[] array) {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			min = array[i] >= min ? min : array[i];
		}
		return min;
	}
}
