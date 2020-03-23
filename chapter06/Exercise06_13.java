package chapter06;

public class Exercise06_13 {
	public static void main(String[] args) {
		System.out.println("i       m(i)");
		System.out.println("--------------");
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%-8d%-6.4f\n", i, sumOfSeries(i));
		}

	}

	public static double sumOfSeries(int series) {
		double sum = 0;
		for (int i = 1; i <= series; i++) {
			sum += i / (i + 1.);
		}
		return (int) (sum * 10_000) / 10_000.;
	}

}
