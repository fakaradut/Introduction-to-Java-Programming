package chapter13.Exercise13_04;

import java.util.GregorianCalendar;

public class MyCalendar extends GregorianCalendar {

	public void displayCalendar() {
		String days = " Sun Mon Tue Wed Thu Fri Sat";
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		System.out.println(days);
		System.out.println("          " + months[get(MONTH)] + "  " + get(YEAR));
		System.out.println("----------------------------");
		int dayOfTheMonth = get(DAY_OF_WEEK);

		for (int spaces = 1; spaces < dayOfTheMonth; spaces++) {
			System.out.print("    ");
		}
		int lines = get(DAY_OF_WEEK);
		for (int i = 1; i <= daysInMonth(); i++, lines++) {
			if (lines % 7 == 0) {
				System.out.printf("%4d\n", i);
			} else {
				System.out.printf("%4d", i);
			}
		}
	}

	public int daysInMonth() {
		switch (get(MONTH)) {
		case 0:
		case 2:
		case 4:
		case 6:
		case 7:
		case 9:
		case 11:
			return 31;
		case 1:
			if (isLeapYear(get(YEAR)))
				return 29;
			else
				return 28;
		case 3:
		case 5:
		case 8:
		case 10:
			return 30;
		default:
			return 0;
		}
	}
}
