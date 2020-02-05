package chapter05;

public class Exercise05_20 {
	public static void main(String[] args) {

		int count = 0;
		boolean isPrime = true;
		for (int number = 2; number <= 1_000; number++) {

			for (int divisor = 2; divisor < number; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				count++;
				if (count % 9 == 0) {
					System.out.println();
				} else {
					System.out.printf("%-5d", number);
				}
			}
			isPrime = true;
		}

	}
}
