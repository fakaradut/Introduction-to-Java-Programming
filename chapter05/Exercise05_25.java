package chapter05;

public class Exercise05_25 {
	public static void main(String[] args) {
		double piApproximately = 0;

		for (int i = 1; i <= 10000; i++) {
			piApproximately += 4. * (Math.pow(-1, i + 1.) / (2. * i - 1));
		}
		System.out.println("Approximate p: " + piApproximately);
		System.out.println("p            : " + Math.PI);

	}
}
