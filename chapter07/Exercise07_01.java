package chapter07;

import java.util.Scanner;

public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of students:");
		int numberOfStudents = input.nextInt();

		int[] numberOfPoints = new int[numberOfStudents];

		for (int i = 0; i < numberOfPoints.length; i++) {
			System.out.println("enter " + numberOfStudents + " scores:");
			numberOfPoints[i] = input.nextInt();
		}

		printGrade(numberOfPoints, findHighestScore(numberOfPoints));

	}

	private static int findHighestScore(int[] numberOfPoints) {
		int max = 0;
		for (int i = 0; i < numberOfPoints.length; i++) {
			max = max >= numberOfPoints[i] ? max : numberOfPoints[i];
		}
		return max;
	}

	private static void printGrade(int[] numberOfPoints, int max) {
		for (int i = 0; i < numberOfPoints.length; i++) {
			if (numberOfPoints[i] >= max - 10) {
				System.out.println("Student " + i + " score is " + numberOfPoints[i] + " and grade is A");
			} else if (numberOfPoints[i] >= max - 20) {
				System.out.println("Student " + i + " score is " + numberOfPoints[i] + " and grade is B");
			} else if (numberOfPoints[i] >= max - 30) {
				System.out.println("Student " + i + " score is " + numberOfPoints[i] + " and grade is C");
			} else if (numberOfPoints[i] >= max - 40) {
				System.out.println("Student " + i + " score is " + numberOfPoints[i] + " and grade is D");
			} else {
				System.out.println("Student " + i + " score is " + numberOfPoints[i] + " and grade is F");
			}
		}
	}
}
