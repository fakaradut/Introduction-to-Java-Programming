package chapter05;

public class Exercise05_06 {
	public static void main(String[] args) {
		System.out.printf("%-10s%10s  |  %10s%10s", "Mil", "Kilometre", "Kilometre", "Mil");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n%-10d %-10.3f |   %-10d  %10.3f", i, i * 1.609, (20 + (i - 1) * 5),
					(20 + (i - 1) * 5) / 1.609);
		}

	}
}
