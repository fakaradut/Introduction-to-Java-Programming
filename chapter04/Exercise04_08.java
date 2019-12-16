package chapter04;

import java.util.Scanner;

public class Exercise04_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int ch = input.nextInt();
		System.out.println("The character for ASCII code " + ch + " is " + (char) (ch));
	}

}
