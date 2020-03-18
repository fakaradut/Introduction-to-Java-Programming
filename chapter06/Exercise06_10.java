package chapter06;

public class Exercise06_10 {
	public static void main(String[] args) {
		System.out.println(isPrime(1_000));

	}

	public static String isPrime(int number) {
		String str = "";

		while (number > 1) {
			boolean isPrime = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {

				str += number + " ";
			}

			number--;
		}
		return str;
	}
}
