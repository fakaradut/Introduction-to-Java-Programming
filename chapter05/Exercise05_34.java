package chapter05;

import java.util.Scanner;

public class Exercise05_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int user;
		int computer;

		int userCount = 0;
		int computerCount = 0;

		while ((computerCount <= 2 && userCount <= 2)) {
			System.out.println("Rock: 0 \nPaper: 1 \nScissor: 2");
			user = input.nextInt();
			computer = (int) (Math.random() * 3);
			switch (user) {
			case 0:
				if (computer == 1) {
					computerCount++;
				} else if (computer == 0)
					;
				else {
					userCount++;
				}
				break;
			case 1:
				if (computer == 2) {
					computerCount++;
				} else if (computer == 1)
					;
				else {
					userCount++;
				}
				break;
			case 2:
				if (computer == 0) {
					computerCount++;
				} else if (computer == 2)
					;
				else {
					userCount++;
				}
				break;
			}
		}
		System.out.println("You won " + userCount + " times.");
		System.out.println("Computer won " + computerCount + " times.");
	}
}
