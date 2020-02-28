package chapter05;

import java.util.Scanner;

public class Exercise05_42 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the commission sought: ");
		double commission = input.nextDouble();
		double gain = 0;

		int sales;

		for (sales = 1; gain <= commission; sales++) {
			if (sales <= 5_000) {
				gain += 0.08;
			} else if (sales <= 10_000) {
				gain += 0.1;
			} else {
				gain += 0.12;
			}

		}

		System.out
				.println("Minimum sales amount you have to generate in order to make " + commission + "$ is: " + sales);

	}

}
