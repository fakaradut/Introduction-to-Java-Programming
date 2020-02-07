package chapter05;

public class Exercise05_23 {

	public static void main(String[] args) {
		double leftSum = 0;
		double rightSum = 0;

		for (int i = 1; i <= 50_000; i++) {
			leftSum += 1. / i;
		}
		for (int i = 50_000; 1 <= i; i--) {
			rightSum += 1. / i;
		}

		System.out.println("Left to right sum: " + leftSum + "\nRight to left sum: " + rightSum);

	}

}
