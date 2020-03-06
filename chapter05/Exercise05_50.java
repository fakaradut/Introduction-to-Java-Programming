package chapter05;

import java.util.Scanner;

public class Exercise05_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		int upperCaseCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				upperCaseCount++;
			}
		}
		System.out.println("The number of uppercase letters is " + upperCaseCount);
	}

}
