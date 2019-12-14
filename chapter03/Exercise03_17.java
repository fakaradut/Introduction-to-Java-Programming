package chapter03;

import java.util.Scanner;

public class Exercise03_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int choice = input.nextInt();
		int computer = (int) (Math.random() * 3);

		System.out.print("The computer is ");
		switch (computer) {
		case 0:
			System.out.print("scissor");
			break;
		case 1:
			System.out.print("rock");
			break;
		case 2:
			System.out.print("paper");
			break;
		}

		System.out.print(". You are ");
		switch (choice) {
		case 0:
			System.out.print("scissor");
			break;
		case 1:
			System.out.print("rock");
			break;
		case 2:
			System.out.print("paper");
			break;
		}
		if (computer == choice) {
			System.out.print(". It is a draw.");
		} else {
			if (computer == 0) {
				if (choice == 1) {
					System.out.println(". You won.");
				} else {
					System.out.println(". You lose.");
				}
			} else if (computer == 1) {
				if (choice == 0) {
					System.out.println(". You lose.");
				} else {
					System.out.println(". You won.");
				}
			} else if (computer == 2) {
				if (choice == 1) {
					System.out.println(". You lose.");
				} else {
					System.out.println(". You won.");
				}
			}

		}

	}
}
