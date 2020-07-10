package chapter18;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise18_01 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.print("Enter an integer: ");

			String number = input.nextLine() + "";
			BigInteger bigInt = new BigInteger(number);

			System.out.println("Factorial of " + number + " is " + factorial(bigInt));
		}
	}

	public static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		} else {
			BigInteger factorial = factorial(n.subtract(BigInteger.ONE));
			return n.multiply(factorial);
		}
	}

}
