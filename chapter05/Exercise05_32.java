package chapter05;

import java.util.Scanner;

public class Exercise05_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int tahmin = input.nextInt();
		int lottery;

		for (;;) {
			lottery = (int) (Math.random() * 90) + 10;
			if (lottery / 10 == lottery % 10) {
				continue;
			} else {
				break;
			}

		}
		System.out.println("The lottery number is " + lottery);

		System.out.println((lottery == tahmin) ? ("You win") : ("You lose"));

	}
}
