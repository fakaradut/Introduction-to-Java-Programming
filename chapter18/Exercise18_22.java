package chapter18;

import java.util.Scanner;

public class Exercise18_22 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a decimal number: ");
			int dec = input.nextInt();
			String hex = dec2Hex(dec);
			System.out.println("Decimal number " + dec + "'s hexadecimal equivalent is " + hex);
		}
	}

	public static String dec2Hex(int value) {
		String hex = "";
		switch (value % 16) {
		case 10:
			hex = "A";
			break;
		case 11:
			hex = "B";
			break;
		case 12:
			hex = "C";
			break;
		case 13:
			hex = "D";
			break;
		case 14:
			hex = "E";
			break;
		case 15:
			hex = "F";
			break;
		default:
			hex = (value % 16) + "";
		}
		if (value / 16 > 0)
			hex = dec2Hex(value / 16) + hex;
		return hex;
	}

}
