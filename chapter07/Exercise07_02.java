package chapter07;

import java.util.Scanner;

public class Exercise07_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter ten number ");
		final int NUMBER = 11;
		int[] numbers = new int[NUMBER];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		reverseNumbers(numbers);
		printArray(numbers);

	}

	public static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static int[] reverseNumbers(int[] array) {
		int temp ;
		for (int i = array.length-1, j = 0; (array.length/2) <= i; i--, j++) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		return array;
	}
}
