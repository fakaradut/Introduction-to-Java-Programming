package chapter05;

import java.util.Scanner;

public class Exercise05_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int decNumber = input.nextInt();
		String binary = "";
		int num = decNumber;

		while (decNumber / 2. != 0) {
			binary = (int) (decNumber % 2) + binary;
			decNumber = (int) (decNumber / 2);
		}

		System.out.println("The binary value of the decimial number " + num + " is: " + binary);

	}

}
