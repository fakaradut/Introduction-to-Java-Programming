package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer m:");
		int m = input.nextInt();
		int n = getSmallestNumberForPerfectSquare(m);
		System.out.println("The smallest number n for m * n to be a perfect square is " + n + " m * n is " + (m * n));
	}

	public static int getSmallestNumberForPerfectSquare(int m) {
		ArrayList<Integer> primeFactors = primeFactors(m);
		ArrayList<Integer> oddNumberOfTimesPrimeNumbers = new ArrayList<>();
		ArrayList<Integer> checkedNumbers = new ArrayList<>();

		for (int i = 0; i < primeFactors.size() ; i++) {
			int appearTimes = 0;
			for (int j = i ; j < primeFactors.size(); j++) {
				if (primeFactors.get(i) == primeFactors.get(j) && !checkedNumbers.contains(primeFactors.get(i))) {
					appearTimes++;
				}
			}
			checkedNumbers.add(primeFactors.get(i));
			if (appearTimes % 2 != 0) {
				oddNumberOfTimesPrimeNumbers.add(primeFactors.get(i));
			}
		}

		int oddNumberMultiply = oddNumberOfTimesPrimeNumbers.get(0);
		for (int i = 1; i < oddNumberOfTimesPrimeNumbers.size(); i++) {
			oddNumberMultiply *= oddNumberOfTimesPrimeNumbers.get(i);
		}
		return oddNumberMultiply;
	}

	private static ArrayList<Integer> primeFactors(int m) {
		ArrayList<Integer> primeFactors = new ArrayList<>();
		int i = 2;
		while (m > 1) {
			if (m % i == 0) {
				primeFactors.add(i);
				m /= i;
			} else {
				for (int j = i + 1;; j++) {
					if (isPrime(j)) {
						i = j;
						break;
					}
				}
			}
		}
		return primeFactors;
	}

	public static boolean isPrime(int number) {
		if(number<2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
