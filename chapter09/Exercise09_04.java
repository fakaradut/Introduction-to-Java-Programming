package chapter09;

import java.util.Random;

public class Exercise09_04 {
	public static void main(String[] args) {
		final int RANDOM_NUMBERS_LENGTH = 50;
		Random randomNumbers = new Random(1_000);

		for (int i = 0; i < RANDOM_NUMBERS_LENGTH; i++) {
			System.out.printf("%-5d", randomNumbers.nextInt(100));
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
