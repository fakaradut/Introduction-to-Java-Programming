package chapter03;

import java.util.Scanner;

public class Exercise03_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.println("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		int dayOfTheMonth = input.nextInt();

		if (month == 1 || month == 2) {
			month += 12;
			year = year - 1;
		}

		int day = (dayOfTheMonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4
				+ 5 * (year / 100)) % 7;

		System.out.print("Day of the week is ");
		switch (day) {
		case 0:
			System.out.print("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.print("Monday");
			break;
		case 3:
			System.out.print("Tuesday");
			break;
		case 4:
			System.out.print("Wednesday");
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday");
			break;

		}
	}
}
