package chapter04;

import java.util.Scanner;

public class Exercise04_22 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter string s1: ");
		String str1 = input.next();
		System.out.println("Enter string s2: ");
		String str2 = input.next();

		if (str1.contains(str2)) {
			System.out.println(str2 + " is a substring of " + str1);
		} else {
			System.out.println(str2 + " is not a substring of " + str1);
		}

	}
}
