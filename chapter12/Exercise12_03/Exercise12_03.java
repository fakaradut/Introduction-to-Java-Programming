package chapter12.Exercise12_03;

import java.util.Scanner;

public class Exercise12_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[100];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100);
		}

		try {
			System.out.println("Enter the index of the array between 0 to 99");
			int index = input.nextInt();
			System.out.println("The element value is " + list[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds.");
		}

	}
}
