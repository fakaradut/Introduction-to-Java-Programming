package chapter05;

public class Exercise05_27 {
	public static void main(String[] args) {

		int i = 101;
		int count = 0;
		while (i < 2101) {
			if (i % 100 != 0 && i % 4 == 0) {

				count++;
				System.out.printf("%5d", i);
			}

			else if (i % 400 == 0) {
				System.out.printf("%5d", i);
				count++;
			}
			if (count % 10 == 0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("\n\nNumber of leap years:" + (count - 1) + " ");
	}
}
