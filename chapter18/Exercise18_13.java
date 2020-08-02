package chapter18;

import java.util.Scanner;

public class Exercise18_13 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.println("Enter eigth integers: ");
			int[] numbers = new int[8];
			for (int i = 0; i < 8; i++) {
				numbers[i] = input.nextInt();
			}
			System.out.println("Largest number is: " + largestNumber(numbers));
		}
	}

	public static int largestNumber(int[] numbers) {
		return largestNumber(numbers, numbers[0], 1);
	}

	private static int largestNumber(int[] numbers, int max, int i) {
		if (numbers[i] > max)
			max = numbers[i];
		i++;
		return numbers.length > i ? largestNumber(numbers, max, i) : max;
	}

}