package chapter05;

import java.util.Scanner;

public class Exercise05_09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		String name;
		double score;
		double highestScore = 0;
		double secondhighestScore = 0;
		String highestName = "";
		String secondHighestName = "";

		for (int x = 0; x < numberOfStudents; x++) {
			System.out.println("Enter the student's name: ");
			name = input.next();
			System.out.println("Enter the student's score:");
			score = input.nextDouble();

			if (highestScore < score) {
				secondhighestScore = highestScore;
				secondHighestName = highestName;
				highestScore = score;
				highestName = name;
			}
		}
		System.out.println("First: " + highestName + " Score: " + highestScore);
		System.out.println("Second: " + secondHighestName + " Score: " + secondhighestScore);

	}
}
