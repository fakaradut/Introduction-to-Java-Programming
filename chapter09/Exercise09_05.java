package chapter09;

import java.util.GregorianCalendar;

public class Exercise09_05 {
	public static void main(String[] args) {
		GregorianCalendar currentTime = new GregorianCalendar();
		int year = currentTime.get(GregorianCalendar.YEAR);
		int month = currentTime.get(GregorianCalendar.MONTH);
		int day = currentTime.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(year + " " + month + " " + day);

		currentTime.setTimeInMillis(1234567898765L);
		System.out.println("\n" + currentTime.get(currentTime.YEAR) + " " + currentTime.get(currentTime.MONTH) + " "
				+ currentTime.get(currentTime.DAY_OF_MONTH));
	}
}
