package chapter05;

public class Exercise05_12 {

	public static void main(String[] args) {
		int number = 0;
		while (Math.pow(number, 2) < 12_000) {
			number++;
		}
		System.out.println("The smallest number greater than 12000 is " + number);
	}
}
