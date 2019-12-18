package chapter12.Exercise12_07;

import java.util.Scanner;

public class Exercise12_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter binary number: ");
		try {
			String binary = input.next();
			int dec = bin2Dec(binary);
			System.out.println("Decimal value: " + dec);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("The end");
	}

	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int binary = Integer.valueOf(binaryString);
		int dec = 0;
		int pow = 0;

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) - '0' > 1) {
				throw new NumberFormatException(
						"String must be binary format.Illegal character: \'" + binaryString.charAt(i) + "\'");
			}
		}
		while (binary != 0) {
			dec += (binary % 10) * Math.pow(2, pow++);
			binary /= 10;
		}
		return dec;
	}
}
