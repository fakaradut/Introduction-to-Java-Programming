package chapter05;

public class Exercise05_03 {
	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds");

		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%-15d%-15.1f\n", i, i * 2.2);
		}
	}
}
