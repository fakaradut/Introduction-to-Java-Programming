package chapter18;

import java.util.Scanner;

public class Exercise18_23 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.println("Enter a binary number: ");
			String bin = input.next();
			int dec = bin2Dec(bin);
			System.out.println("Decimal value of binary " + bin + " number is: " + dec);
		}
	}

	public static int bin2Dec(String binaryString) {
		if (binaryString.length() > 0)
			return bin2Dec(binaryString, 0);
		return Integer.parseInt(binaryString);
	}

	private static int bin2Dec(String binaryString, int power) {
		String result = (Integer.parseInt(binaryString) * (int) Math.pow(2, power)) + "";
		if (binaryString.length() > 1) {
			int digit = Integer.parseInt(binaryString.charAt(binaryString.length() - 1) + "")
					* (int) Math.pow(2, power);
			result = (bin2Dec(binaryString.substring(0, (binaryString.length() - 1)), power + 1) + digit) + "";
		}
		return Integer.parseInt(result);

	}

}
