package chapter05;

public class Exercise05_11 {
	public static void main(String[] args) {
		int x = 100;
		while (x < 201) {
			if ((x % 5 == 0 || x % 6 == 0)) {
				if (x % 5 == 0 && x % 6 == 0) {
				} else {
					System.out.print(x + " ");
				}
			}
			x++;
		}
	}
}
