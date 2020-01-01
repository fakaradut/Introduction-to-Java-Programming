package chapter07;

import java.util.Scanner;

public class Exercise07_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numberArray = new int[100];
		System.out.println("Enter the integers between 1 and 100: ");
		int number = 1;

		while (number != 0) {
			System.out.println("Enter the integers between 1 and 100: ");
			number = input.nextInt();
			if(number==0) {
				break;
			}
			numberArray[number - 1]++;
		}
		printOccurs(numberArray);

	}

	public static void printOccurs(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				System.out.println(i + 1 + " occurs " + numbers[i] + " times");
			}
		}
	}
}
