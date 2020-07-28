package chapter18;

import java.util.Scanner;

public class Exercise18_10 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.print("Enter a string: ");
			String str = input.nextLine();
			System.out.print("Enter a character: ");
			char a = input.nextLine().charAt(0);
			int times = count(str, a);
			System.out.println(a + " appears " + times + (times > 1 ? " times " : " time ") + "in " + str);
		}
	}

	public static int count(String str, char a) {
		int count = 0;
		if (str.length() > 0) {
			count = count(str.substring(1), a) + ((str.charAt(0) == a) ? 1 : 0);
		}
		return count;
	}
}
