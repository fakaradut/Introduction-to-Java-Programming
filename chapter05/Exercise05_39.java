package chapter05;

public class Exercise05_39 {
	public static void main(String[] args) {

		int sale;
		double income = 5_000;

		for (sale = 1; income <= 30_000; sale++) {

			if (sale <= 5_000) {
				income += (0.08);
			} else if (sale <= 10_000) {
				income += (0.1);
			} else {
				income += (0.12);
			}

		}
		System.out.println("Minimum sales you have to generate in order to make $30,000: " + sale);
	}
}
