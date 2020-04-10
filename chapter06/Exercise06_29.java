package chapter06;

public class Exercise06_29 {
	public static void main(String[] args) {

		for (int i = 3; i <= 998; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf("%1s%-3d ,%4d)\n","(", i, i + 2);
			}

		}
	}

	public static boolean isPrime(int number) {
		if (number < 2)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}

		return true;
	}
}
