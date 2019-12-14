package chapter03;

import java.util.Scanner;

public class Exercise03_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day:");
		int day = input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int numberOfDays = input.nextInt() % 7 + day;
		System.out.print("Today is ");

		switch (day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;

		default:
			System.out.print("Invalid day");
			break;
		}

		System.out.print(" and the future day is ");
		switch (numberOfDays) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		}

	}
}
