package chapter07;

import java.util.Scanner;

public class Exercise07_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of student: ");

		final int NUMBER_OF_STUDENT = input.nextInt();
		double[] scores = new double[NUMBER_OF_STUDENT];
		String[] names = new String[NUMBER_OF_STUDENT];

		System.out.println("Enter students names and students scores: ");
		for (int i = 0; i < NUMBER_OF_STUDENT; i++) {
			names[i] = input.next();
			scores[i] = input.nextDouble();
		}

		sortingStudents(scores, names);

		for (int i = NUMBER_OF_STUDENT - 1; 0 <= i; i--) {
			System.out.printf("%-10s%-2s%-4.1f\n", names[i], ":", scores[i]);
		}

	}

	public static void sortingStudents(double[] scores, String[] names) {
		int currentMinIndex;
		double min;

		for (int i = 0; i < names.length - 1; i++) {
			min = scores[i];
			currentMinIndex = i;
			int j;
			for (j = i + 1; j < names.length; j++) {
				if (scores[j] < min) {
					min = scores[j];
					currentMinIndex = j;
				}
			}

			scores[currentMinIndex] = scores[i];
			scores[i] = min;
			String temp = names[i];
			names[i] = names[currentMinIndex];
			names[currentMinIndex] = temp;

		}

	}
}
