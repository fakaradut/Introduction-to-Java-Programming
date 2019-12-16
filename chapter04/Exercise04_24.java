package chapter04;

import java.util.Scanner;

public class Exercise04_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first city: ");
		String country1 = input.nextLine();
		System.out.println("Enter the second city: ");
		String country2 = input.nextLine();
		System.out.println("Enter the third city: ");
		String country3 = input.nextLine();

		System.out.print("The three cities in alphabetical order are ");
		if (country1.compareToIgnoreCase(country2) > 0 && country1.compareToIgnoreCase(country3) > 0) {
			if (country2.compareToIgnoreCase(country3) > 0) {
				System.out.println(country3 + " " + country2 + " " + country1);
			} else {
				System.out.println(country2 + " " + country3 + " " + country1);
			}

		} else if (country2.compareToIgnoreCase(country1) > 0 && country2.compareToIgnoreCase(country3) > 0) {
			if (country1.compareToIgnoreCase(country3) > 0) {
				System.out.println(country3 + " " + country1 + " " + country2);
			} else {
				System.out.println(country1 + " " + country3 + " " + country2);
			}

		} else {
			if (country1.compareToIgnoreCase(country2) > 0) {
				System.out.println(country2 + " " + country1 + " " + country3);
			}else {
				System.out.println(country1 + " " + country2 + " " + country3);
			}
		}
	}
}
