package chapter05;

public class Exercise05_05 {
	public static void main(String[] args) {
		System.out.println("kilogram\tpound\t\tpound\tkilogram");

		for (int x = 1; x < 200; x += 2) {
			System.out.printf("%-8s\t%-5.2f\t\t%-5.2f\t%-5.2f\n", x, x * 2.2, (20 + (x - 1) * 2.5),
					(20 + (x - 1) * 2.5) / 2.2);

		}

	}
}
