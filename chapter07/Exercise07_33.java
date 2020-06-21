package chapter07;

import java.util.Scanner;

public class Exercise07_33 {
	public static void main(String[] args) {
		String[] chineseZodiac = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.println(chineseZodiac[year % 12]);
	}
}
