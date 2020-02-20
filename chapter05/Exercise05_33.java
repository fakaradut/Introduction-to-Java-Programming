package chapter05;

public class Exercise05_33 {

	public static void main(String[] args) {

		int sum;
		boolean isPerfect;

		for (int i = 1; i <= 10_000; i++) {
			sum = 0;
			isPerfect = false;
			for (int j = 1; j < i; j++) {
				sum += (i % j == 0) ? j : 0;
			}
			isPerfect = (sum == i) ? (true) : (false);
			if (isPerfect) {
				System.out.println("Perfect number: " + i);

			}
		}
	}
}
