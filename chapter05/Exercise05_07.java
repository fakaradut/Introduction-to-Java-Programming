package chapter05;

public class Exercise05_07 {
	public static void main(String[] args) {
		int okulUcret = 10000;

		for (int x = 10; x < 15; x++) {
			System.out
					.println(x + ". yilinda okul ucreti: " + (int) (okulUcret * Math.pow((1 + 0.05), x) * 100) / 100.);
		}

	}
}
