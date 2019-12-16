package chapter04;

import java.util.Scanner;

public class Exercise04_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = input.next().charAt(0);

		System.out.println("The Unicode for the character " + ch + " is " + (int) (ch));
	}

}
