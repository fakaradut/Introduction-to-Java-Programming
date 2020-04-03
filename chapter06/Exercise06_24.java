package chapter06;

public class Exercise06_24 {
	public static void main(String[] args) {

		long second = System.currentTimeMillis() / 1000;
		long minute = second / 60;
		long hour = minute / 60;
		long day = hour / 24;
		int year = 1970;

		long i = 0;
		for (i = day; i > 365 + (isLeapYear(year + 1) ? 1 : 0); i -= 365 + (isLeapYear(year) ? 1 : 0), year++) {

		}
		if (hour > 0) {
			i++;
		}

		int currentHour = (int) (hour % 24);
		int currentMinute = (int) (minute % 60);
		int currentSecond = (int) (second % 60);

		System.out.println(date(day((int) i, month((int) i, year), year), month((int) i, year), year) + (currentHour)
				+ ":" + currentMinute + ":" + currentSecond + " GMT");
	}

	public static int day(int i, int month, int year) {
		switch (month) {
		case 1:
			return i;
		case 2:
			return i - 31;
		case 3:
			return i - (isLeapYear(year) ? 60 : 59);
		case 4:
			return i - (isLeapYear(year) ? 91 : 90);
		case 5:
			return i - (isLeapYear(year) ? 121 : 120);
		case 6:
			return i - (isLeapYear(year) ? 152 : 151);
		case 7:
			return i - (isLeapYear(year) ? 182 : 181);
		case 8:
			return i - (isLeapYear(year) ? 213 : 212);
		case 9:
			return i - (isLeapYear(year) ? 244 : 243);
		case 10:
			return i - (isLeapYear(year) ? 274 : 273);
		case 11:
			return i - (isLeapYear(year) ? 305 : 304);
		default:
			return i - (isLeapYear(year) ? 335 : 334);
		}
	}

	public static int month(int i, int year) {
		if (i <= 31) {
			return 1;
		} else if (i - 31 <= (isLeapYear(year) ? 29 : 28)) {
			return 2;
		} else if (i - (isLeapYear(year) ? 60 : 59) <= 31) {
			return 3;
		} else if (i - (isLeapYear(year) ? 91 : 90) <= 30) {
			return 4;
		} else if (i - (isLeapYear(year) ? 121 : 120) <= 31) {
			return 5;
		} else if (i - (isLeapYear(year) ? 152 : 151) <= 30) {
			return 6;
		} else if (i - (isLeapYear(year) ? 182 : 181) <= 31) {
			return 7;
		} else if (i - (isLeapYear(year) ? 213 : 212) <= 31) {
			return 8;
		} else if (i - (isLeapYear(year) ? 244 : 243) <= 30) {
			return 9;
		} else if (i - (isLeapYear(year) ? 274 : 273) <= 31) {
			return 10;
		} else if (i - (isLeapYear(year) ? 305 : 304) <= 30) {
			return 11;
		} else {
			return 12;
		}

	}

	public static boolean isLeapYear(int yil) {
		boolean isLeapYear;
		isLeapYear = yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0 && yil % 4000 != 0;
		return isLeapYear;
	}

	public static String date(int day, int month, int year) {
		return day + "." + month + "." + year + "\n";
	}
}
