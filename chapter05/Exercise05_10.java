package chapter05;

public class Exercise05_10 {

	public static void main(String[] args) {

		int count = 0;
		String str = "";
		for (int x = 100; x <= 1_000; x++) {
			if (x % 5 == 0 && x % 6 == 0) {
				count++;
				str = x + " ";
				System.out.print(str);
				if (count % 10 == 0) {
					System.out.println("\n");
					str = "";
				}
			}
		}
	}
}
