package chapter04;

import java.util.Scanner;

public class Exercise04_14 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade:");
		char letter = input.next().toLowerCase().charAt(0);

		switch (letter) {
		case 'a':
			System.out.print("The numeric value for grade A is ");
			System.out.println('4');
			break;
		case 'b':
			System.out.print("The numeric value for grade B is ");
			System.out.println('3');
			break;
		case 'c':
			System.out.print("The numeric value for grade C is ");
			System.out.println('2');
			break;
		case 'd':
			System.out.print("The numeric value for grade D is ");
			System.out.println('1');
			break;
		case 'f':
			System.out.print("The numeric value for grade F is ");
			System.out.println('0');
			break;
		default:
			System.out.println(letter + " is an invalid grade");
			break;
		}

	}
	
}
