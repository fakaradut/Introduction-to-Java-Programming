package chapter13.Exercise13_19;

import java.math.BigInteger;
import java.util.Scanner;

public class TestExercise13_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		String number = input.next();
		boolean positive = number.charAt(0) != '-';
		if (!positive) {
			number = number.replace("-", "");
		}
		int fraction = number.length() - (number.indexOf(".") + 1);
		number = number.replace(".", "");

		Rational r = new Rational(new BigInteger(number), new BigInteger((long) Math.pow(10, fraction) + ""));

		System.out.println("The fraction number is " + r);
		input.close();
	}

}
