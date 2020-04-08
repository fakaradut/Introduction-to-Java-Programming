package chapter06;

public class Exercise06_27 {

	public static void main(String[] args) {

		int lasaCounter = 0;
		int outputCounter = 0;

		for (int i = 2; lasaCounter < 200; i++) {
			if (!isPalindrom(i) && isPrime(i)) {
				if (isPrime(reverseNumber(i))) {
					lasaCounter++;
					outputCounter++;
					if (outputCounter % 10 == 0) {
						System.out.printf("%5d\n", i);
					} else {
						System.out.printf("%5d", i);
					}
				}
			}
		}

	}

	public static int reverseNumber(int number) {
		int reverseNumber = 0;
		while (number != 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		return reverseNumber;
	}

	public static boolean isPalindrom(int number) {
		return number == reverseNumber(number);
	}

	public static boolean isPrime(int number) {
		if (number == 1||number==0)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}
}