package chapter05;

public class Exercise05_26 {
	public static void main(String[] args) {

		double e = 1;
		double factorial = 1;
		for (int i = 1; i <= 100_000; i++) {
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			e += 1. / factorial;

			factorial = 1;

			if (i % 10_000 == 0) {
				System.out.println(i + ": " + e);
			}
		}
		System.out.println("Approximately: " + e);

	}
}
