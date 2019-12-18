package chapter12.Exercise12_02;

import java.util.*;

public class Exercise12_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = -1;
		int num2 = 1;

		while (true) {
			try {
				System.out.println("Enter two numbers: ");
				num1 = input.nextInt();
				num2 = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.print("Incorrect input and re-enter two integers: ");
				input.nextLine();
			}
		}
		
		System.out.println("Sum: " + (num1 + num2));
	}
}
