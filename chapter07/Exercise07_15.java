package chapter07;

import java.util.Scanner;

public class Exercise07_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_LENGTH = 10;
		int[] array = new int[ARRAY_LENGTH];
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		eliminateDuplicates(array);
		int zeroCount = 0;
		System.out.println("The distinct numbers are: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.print(array[i] + " ");
			} else if (array[i] == 0 && zeroCount < 1) {
				zeroCount++;
				System.out.print(array[i] + " ");
			}
		}

	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			boolean isDublicate = false;
			for (int j = 0; j < i; j++) {
				if (list[i] == list[j]) {
					isDublicate = true;
					break;
				}
			}
			if (!isDublicate && 0 < i) {
			} else {
				list[i] = 0;
			}
		}

		return newList;
	}
}
