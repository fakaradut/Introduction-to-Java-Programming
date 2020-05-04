package chapter08;

import java.util.Scanner;

public class Exercise08_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of cities: ");
		int numberOfCities = input.nextInt();
		System.out.println("Enter the coordinates of the cities: ");
		double[][] cities = new double[numberOfCities][2];
		for (int i = 0; i < cities.length; i++) {
			for (int j = 0; j < cities[i].length; j++) {
				cities[i][j] = input.nextDouble();
			}
		}
		getCentralPoint(cities);
	}

	private static void getCentralPoint(double[][] cities) {
		double[] coordinate = new double[2];
		double minSum = Double.MAX_VALUE;
		for (int i = 0; i < cities.length; i++) {
			double sum = 0;
			for (int j = 0; j < cities.length; j++) {
				if (i != j) {
					double distance = Math
							.sqrt(Math.pow(cities[i][0] - cities[j][0], 2) + Math.pow(cities[i][1] - cities[j][1], 2));
					sum += distance;
				}
			}
			if (sum < minSum) {
				minSum = sum;
				coordinate[0] = cities[i][0];
				coordinate[1] = cities[i][1];
			}
		}
		System.out.println("The central city at (" + coordinate[0] + "," + coordinate[1] + ")");
		System.out.println("The total distance to all other cities is " + minSum);

	}
}
