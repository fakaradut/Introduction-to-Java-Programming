package chapter06;

public class Exercise06_01 {

	public static void main(String[] args) {
		final int NUMBER_OF_LOOP = 100;
		final int NUMBER_OF_LINE = 10;

		for (int i = 1; i <= NUMBER_OF_LOOP; i++) {
			System.out.printf("%-6d", getPentagonalNumberOneByOne(i));
			if (i % NUMBER_OF_LINE == 0)
				System.out.println();
		}
		System.out.println("--------------------------------------");
		getPentagonalNumber(1);
	}

	public static int getPentagonalNumberOneByOne(int n) {
		n = n * (3 * n - 1) / 2;
		return n;
	}

	public static void getPentagonalNumber(int n) {

		for (int i = 1; i <= 100; i++) {
			int equation = n * (3 * n - 1) / 2;
			System.out.printf("%-6d", equation);
			n++;
			if (i % 10 == 0) {
				System.out.println();
			}
		}

	}
}
