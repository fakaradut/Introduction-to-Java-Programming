package chapter05;
import java.util.Scanner;

public class Exercise05_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = input.nextInt();
		boolean isLeap = (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0 && year % 4000 != 0);
		System.out.println("Enter first day of the year: ");
		int firstDay = input.nextInt();
		int daysOfTheMonth = 0;
		int count = firstDay;
		for (int month = 1; month <= 12; month++) {
			System.out.println();
			switch (month) {
			case 1:daysOfTheMonth=31;System.out.println("\t\tJanuary");break;
			case 2:if(isLeap)daysOfTheMonth=29;else daysOfTheMonth=28;System.out.println("\t\tFebruary");break;
			case 3:daysOfTheMonth=31;System.out.println("\t\tMarch");break;
			case 4:daysOfTheMonth=30;System.out.println("\t\tApril");break;
			case 5:daysOfTheMonth=31;System.out.println("\t\tMay");break;
			case 6:daysOfTheMonth=30;System.out.println("\t\tJune");break;
			case 7:daysOfTheMonth=31;System.out.println("\t\tJuly");break;
			case 8:daysOfTheMonth=31;System.out.println("\t\tAugust");break;
			case 9:daysOfTheMonth=30;System.out.println("\t\tSeptember");break;
			case 10:daysOfTheMonth=31;System.out.println("\t\tOctober");break;
			case 11:daysOfTheMonth=30;System.out.println("\t\tNovember");break;
			case 12:daysOfTheMonth=31;System.out.println("\t\tDecember");break;}
		
			System.out.println("---------------------------------");
			System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n","Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
			
			for (int spaces = 0; spaces < firstDay%7; spaces++) {
				System.out.print("     ");
			}
			for(int i=1;i<=daysOfTheMonth;i++) {
				if(count%7==0)System.out.println();
			
			System.out.printf("%-5d",i);
			count++;count%=7;
			}
			System.out.println(); 
			firstDay=(firstDay+daysOfTheMonth)%7;
		}
	}
}
