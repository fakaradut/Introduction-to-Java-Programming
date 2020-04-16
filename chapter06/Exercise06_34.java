package chapter06;

public class Exercise06_34 {

	public static void main(String[] args) {
		
		calender(zellerAlgorithm(2023));
	}
	public static void calender(int day) {
		day += 5;
		day = day % 7;
		System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n","pzt","sal","crs","prs","cum","cmt","pzr");
		for (int bosluk = 0; bosluk < day; bosluk++) {
			System.out.print("     ");
		}
		for (int i = 1; i <= 31; i++) {
			if((i+(day-1))%7==0)System.out.println();
			System.out.printf("%-5d",i);
		}

	}

	public static int zellerAlgorithm(int year) {
		year--;
		int formule = (1 + (26 * 14) / 10 + year % 100 + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
		return formule;
	}

}
