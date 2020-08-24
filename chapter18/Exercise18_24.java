package chapter18;

import java.util.Scanner;

public class Exercise18_24 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a hex number: ");
			String hex = input.nextLine();
			System.out.println(hex + " is decimal " + hex2Dec(hex));
		}
	}

	public static int hex2Dec(String hexString) {
		return hex2Dec(hexString.toUpperCase(), hexString.length() - 1);
	}

	private static int hex2Dec(String hexString, int index) {
		if (index >= 0) {
			char ch = hexString.charAt(index);
			int dec = (('0' <= ch && ch <= '9') ? ch - '0' : ch - 'A' + 10)
					* (int) Math.pow(16, hexString.length() - 1 - index);
			return hex2Dec(hexString, --index) + dec;
		}
		return 0;
	}

}
