package chapter12.Exercise12_06;

import java.util.Scanner;

public class Exercise12_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter a hex number: ");
			String hex = input.nextLine();
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

	public static int hexToDecimal(String hex) throws NumberFormatException {
		for (int i = 0; i < hex.length(); i++) {
			if (!isHex(hex.charAt(i))) {
				throw new NumberFormatException("Illegal character: " + hex.charAt(i));
			}
		}
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}

	public static boolean isHex(char ch) {
		if (Character.isLetter(ch)) {
			if (ch < 'A' || ch > 'F') {
				return false;
			} else {
				return true;
			}
		} else {
			boolean isDigit = 0 <= ch - '0' && ch - '0' <= 9;
			return isDigit;
		}
	}

}
