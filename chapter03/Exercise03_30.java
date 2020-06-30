package chapter03;

import java.util.Scanner;

public class Exercise03_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int timeZone = input.nextInt();
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		int hour;
		String str = "";
		if ((currentHour + timeZone) >= 12) {
			hour = (int) (currentHour + timeZone) - 12;
			str = "PM";
		} else {
			hour = (int) (currentHour + timeZone);
			str = "AM";
		}

		System.out.println("Current time is " + hour + ":" + currentMinute + ":" + currentSecond + " " + str);
	
	}
}
