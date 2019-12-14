package chapter03;

import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int coin = (int) (Math.random() * 2);
		System.out.println("Enter 0 or 1 which represents head or tail.");
		int guess = input.nextInt();
		
		if (0 == guess || guess == 1) {
			if (guess == coin) {
				System.out.println("You win.");
			} else {
				System.out.println("You lose");
			}
		}
		else {
			System.out.println("Invalid input. ");
		}
	}
}
