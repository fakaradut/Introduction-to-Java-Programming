package chapter06;

public class Exercise06_16 {
	public static void main(String[] args) {
		for (int i = 2_000; i <= 2_020; i++) {
			System.out.println("Year " + i +" is "+ numberOfDaysInAYear(i) + " days.");
		}
	}

	public static int numberOfDaysInAYear(int year) {
		boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 4_000 != 0 && year % 400 == 0;
		return isLeap ? 356 : 355;
	}
}
