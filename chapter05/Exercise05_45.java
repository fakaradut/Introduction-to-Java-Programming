package chapter05;

import java.util.Scanner;

public class Exercise05_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double number;
		double mean = 0;
		double square = 0;
		double sum = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter ten numbers: ");
			number = input.nextDouble();
			mean += number;
			square += Math.pow(number, 2);
		}

		sum = mean;
		mean = mean / 10.;
		double deviation = Math.pow((square - Math.pow(sum, 2) / 10.) / 9., 1 / 2.);

		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation);
	}
}
