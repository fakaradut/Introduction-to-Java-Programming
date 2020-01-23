package chapter05;

import java.util.Scanner;

public class Exercise05_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		long startTime = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
			int num1 = (int) (Math.random() * 15) + 1;
			int num2 = (int) (Math.random() * 15) + 1;
			int sum = num1 + num2;
			System.out.println("What is " + num1 + " + " + num2 + " =  ?");
			int guess = input.nextInt();
			str += num1 + " + " + num2 + " = " + guess;
			if (guess == sum) {
				correctCount++;
				str += " correct\n";
				System.out.println("You are correct!");
			} else {
				str += " wrong\n";
				System.out.println("Your answer is wrong.");
				System.out.println(num1 + " + " + num2 + " should be " + (num1 + num2));
			}

		}
		long endTime = System.currentTimeMillis();

		System.out.println("\nCorrect count is " + correctCount);
		System.out.println("Test time is " + (endTime - startTime) / 1_000 + " seconds\n");
		System.out.println(str);

	}

}
