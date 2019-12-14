package chapter03;

import java.util.Scanner;

public class Exercise03_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double tempFahrenheit = input.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double wind = input.nextDouble();

		if (tempFahrenheit < -58 || tempFahrenheit > 41) {
			if (wind < 2) {
				System.out.println("Temperature and wind speed is invalid.");
			} else {
				System.out.println("Temperature is invalid.");
			}
		} else if (wind < 2) {
			System.out.println("Wind is invalid.");
		} else {

			double windChillIndex = 35.74 + 0.6215 * tempFahrenheit - 35.75 * Math.pow(wind, 0.16)
					+ 0.4275 * tempFahrenheit * Math.pow(wind, 0.16);
			System.out.println("The wind chill index is " + windChillIndex);
		}
	}
}
