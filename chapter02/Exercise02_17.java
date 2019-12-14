package chapter02;

import java.util.Scanner;

public class Exercise02_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double tempFahrenheit = input.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double wind = input.nextDouble();
		double windChillIndex = 35.74 + 0.6215 * tempFahrenheit - 35.75 * Math.pow(wind, 0.16)
				+ 0.4275 * tempFahrenheit * Math.pow(wind, 0.16);
		System.out.println("The wind chill index is " + windChillIndex);
	}
}
