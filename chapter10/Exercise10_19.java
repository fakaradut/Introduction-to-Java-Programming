package chapter10;

import java.math.BigInteger;

public class Exercise10_19 {
	public static void main(String[] args) {
		int[] firstHundredPrimeNumbers = new int[100];
		int count = 0;
		for (int i = 2; count < 100; i++) {
			if (isPrime(i)) {
				firstHundredPrimeNumbers[count++] = i;
			}
		}
		BigInteger mersennePrimeNumber;

		System.out.printf("%-5s%-1s", "p", "2^p - 1");
		for (int i = 0; i < firstHundredPrimeNumbers.length; i++) {
			mersennePrimeNumber = new BigInteger(2 + "").pow(firstHundredPrimeNumbers[i]).subtract(new BigInteger("1"));
			System.out.printf("\n%-5d%-1s", firstHundredPrimeNumbers[i], "" + mersennePrimeNumber);
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
