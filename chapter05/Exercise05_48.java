package chapter05;

import java.util.Scanner;

public class Exercise05_48 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = input.nextLine();
		String str = "";
		for (int i = 0; i < word.length(); i += 2) {
			str += word.charAt(i);
		}
		System.out.println(str);
	}

}
