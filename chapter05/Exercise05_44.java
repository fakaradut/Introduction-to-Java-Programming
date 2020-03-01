package chapter05;

import java.util.Scanner;

public class Exercise05_44 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		int number = input.nextInt();
		String str = "";
		int count = 0;

		for (int i = number; i != 0; i /= 2) {
			str = i % 2 + str;
			count++;
		}

		for (int i = 0; i < 16 - count; i++) {
			str = "0" + str;
		}

		System.out.println("The bits are " + str);

	}
}
