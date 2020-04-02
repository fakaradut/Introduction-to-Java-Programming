package chapter06;

public class Exercise06_22 {
	public static void main(String[] args) {
		System.out.println(sqrt(25));
	}

	public static double sqrt(long n) {

		double nextGuess = 1.0;
		double lastGuess;

		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (n / lastGuess)) * 0.5;
		} while (Math.abs(nextGuess - lastGuess) >= 0.00000000001);

		return nextGuess;

	}
}
