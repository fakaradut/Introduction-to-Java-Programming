package chapter04;

import java.util.Scanner;

public class Exercise04_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out
				.println("Enter a month: (first three letters of a month name (with the first letter in uppercase)) ");
		String month = input.next();

		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0 && year % 4000 != 0);

		System.out.print(month + " " + year + " has ");

		if (month.equals("Jun") || month.equals("Nov") || month.equals("Sep") || month.equals("Apr")) {
			System.out.println("30 days");
		} else if (month.equals("Mar") || month.equals("Aug") || month.equals("May") || month.equals("Oct")
				|| month.equals("Jan") || month.equals("Dec") || month.equals("Jul")) {
			System.out.println("31 days");
		} else {
			System.out.println(((isLeapYear) ? 29 : 28) + " days");
		}
	}

}
