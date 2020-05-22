package chapter10.Exercise10_14;

import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		GregorianCalendar dt = new GregorianCalendar();
		year = dt.get(GregorianCalendar.YEAR);
		month = dt.get(GregorianCalendar.MONTH)+1;
		day = dt.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public MyDate(long L) {
		GregorianCalendar dt = new GregorianCalendar();
		dt.setTimeInMillis(L);
		year = dt.get(GregorianCalendar.YEAR);
		month = dt.get(GregorianCalendar.MONTH)+1;
		day = dt.get(GregorianCalendar.DAY_OF_MONTH);

	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setTime(long L) {
		GregorianCalendar dt = new GregorianCalendar();
		dt.setTimeInMillis(L);
		year = dt.get(GregorianCalendar.YEAR);
		month = dt.get(GregorianCalendar.MONTH)+1;
		day = dt.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

}
