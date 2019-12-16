package chapter04;

import java.util.Scanner;

public class Exercise04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		String str = input.next();
		char major = str.charAt(0);
		char academicStanding = str.charAt(1);

		String s = "";
		switch (major) {
		case 'M':
			s += "Mathematics";
			break;
		case 'C':
			s += "Computer Science";
			break;
		case 'I':
			s += "Information Technology";
			break;
		default:
			System.out.println("Invalid input");
			System.exit(1);
		}
		switch (academicStanding) {
		case '1':
			s += " Freshman";
			break;
		case '2':
			s += " Sophomore";
			break;
		case '3':
			s += " Junior";
			break;
		case '4':
			s += " Senior";
			break;
		default:
			System.out.println("Invalid input");
			System.exit(1);
		}
		System.out.println(s);
	}

}
