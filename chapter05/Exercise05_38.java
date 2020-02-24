package chapter05;

import java.util.Scanner;

public class Exercise05_38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int decNum = input.nextInt();
		String str = "";
		int num = decNum;
		while (decNum != 0) {
			str = (decNum % 8) + str;
			decNum /= 8;
		}

		System.out.println(num + "'s octal representation is " + str);

	}

}
