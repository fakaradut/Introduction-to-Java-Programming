package chapter06;

public class Exercise06_14 {
	public static void main(String[] args) {
		System.out.printf("%-8s%-6s\n", "i", "m(i)");
		System.out.println("--------------");
		for (int i = 1; i <= 901; i += 100) {
			System.out.printf("%-8d%-6.4f\n", i, series(i));
		}
	}

	public static double series(int number) {

		double sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += 4 * ((Math.pow(-1, i + 1) / (2 * i - 1.)));
		}

		return sum;
	}

}
