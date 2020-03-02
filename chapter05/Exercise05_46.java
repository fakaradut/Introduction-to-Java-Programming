package chapter05;

import java.util.Scanner;

public class Exercise05_46 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = input.nextLine();
		String str = "";

		for (int i = word.length() - 1; 0 <= i; i--) {
			str = str + word.charAt(i);
		}
		System.out.println(str);
	}
}
