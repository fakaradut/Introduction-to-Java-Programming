package chapter05;

import java.util.Scanner;

public class Exercise05_51 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = input.nextLine();

		String str = "";
		int index = 0;

		while (str1.charAt(index) == str2.charAt(index)) {
			str += str1.charAt(index);
			index++;
		}
		
		System.out.print(str1 + " and " + str2 + " ");
		if (str.length() > 0) {
			System.out.println("have common prefix: " + str);
		} else {
			System.out.println("have no common prefix");
		}

	}

}
