package chapter18;

import java.util.Scanner;

public class Exercise18_21 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a decimal number: ");
			int dec = input.nextInt();
			String bin = dec2Bin(dec);
			System.out.println("Decimal number " + dec + "'s binary equivalent is " + bin);
		}
	}

	public static String dec2Bin(int value) {
		String bin = (value % 2) + "";
		if (value / 2 > 0)
			bin = dec2Bin(value / 2) + bin;
		return bin;
	}

}
