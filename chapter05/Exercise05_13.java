package chapter05;

public class Exercise05_13 {

	public static void main(String[] args) {
		int number = 0;

		while (Math.pow(number, 3) < 12_000) {
			number++;
		}
		System.out.println("The largest integer n such that n3 is less than is 12000 is " + (number - 1));
	}

}
