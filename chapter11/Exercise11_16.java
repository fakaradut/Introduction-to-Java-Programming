package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		ArrayList<Integer> wrongAnswers = new ArrayList<>();
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

		while (number1 + number2 != answer) {
			System.out.print(wrongAnswers.contains(answer) ? ("You already entered " + answer)
					: "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			wrongAnswers.add(answer);
			answer = input.nextInt();
		}

		System.out.println("You got it!");

	}
}
