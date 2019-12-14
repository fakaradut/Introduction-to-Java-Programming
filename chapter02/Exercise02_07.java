package chapter02;

import java.util.Scanner;

public class Exercise02_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		long numberOfMinutes = input.nextLong();
		long hour = numberOfMinutes / 60;
		long day = hour / 24;
		int year = (int) day / 365;
		System.out.println(numberOfMinutes + " minutes is approximately " + year + " years and " + day % 365 + " days");
	}
}
