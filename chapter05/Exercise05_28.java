package chapter05;

import java.util.Scanner;

public class Exercise05_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year:");
		int day = input.nextInt();
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 4000 != 0 && year % 400 == 0);
		String str = "";

		for (int month = 1; month <= 12; month++) {
			str = "";
			day %= 7;
			switch (day) {
			case 0:
				str += "Sunday  ";
				break;
			case 1:
				str += "Monday  ";
				break;
			case 2:
				str += "Tuesday  ";
				break;
			case 3:
				str += "Wednesday  ";
				break;
			case 4:
				str += "Thursday  ";
				break;
			case 5:
				str += "Friday  ";
				break;
			case 6:
				str += "Saturday  ";
				break;
			}

			switch (month) {
			case 1:
				str += "1 January ";
				day += 31;
				break;
			case 2:
				str += "1 February ";
				if (isLeap) {
					day += 29;
				} else {
					day += 28;
				}
				break;
			case 3:
				str += "1 March ";
				day += 31;
				break;
			case 4:
				str += "1 April ";
				day += 30;
				break;
			case 5:
				str += "1 May ";
				day += 31;
				break;
			case 6:
				str += "1 June ";
				day += 30;
				break;
			case 7:
				str += "1 July ";
				day += 31;
				break;
			case 8:
				str += "1 August ";
				day += 31;
				break;
			case 9:
				str += "1 September ";
				day += 30;
				break;
			case 10:
				str += "1 October ";
				day += 31;
				break;
			case 11:
				str += "1 November ";
				day += 30;
				break;
			case 12:
				str += "1 December ";
				day += 31;
				break;
			}
			str += " " + year;
			System.out.println(str);
		}

	}

}
