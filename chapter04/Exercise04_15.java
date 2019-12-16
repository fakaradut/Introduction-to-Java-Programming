package chapter04;

import java.util.Scanner;

public class Exercise04_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char ch = input.next().toLowerCase().charAt(0);

		if ('a' == ch || 'b' == ch || 'c' == ch) {
			System.out.println("The corresponding number is 2");
		} else if ('d' == ch || 'e' == ch || 'f' == ch) {
			System.out.println("The corresponding number is 3");
		} else if ('g' == ch || 'h' == ch || 'i' == ch) {
			System.out.println("The corresponding number is 4");
		} else if ('j' == ch || 'j' == ch || 'l' == ch) {
			System.out.println("The corresponding number is 5");
		} else if ('m' == ch || 'n' == ch || 'o' == ch) {
			System.out.println("The corresponding number is 6");
		} else if ('p' == ch || 'q' == ch || 'r' == ch || 's' == ch) {
			System.out.println("The corresponding number is 7");
		} else if ('t' == ch || 'u' == ch || 'v' == ch) {
			System.out.println("The corresponding number is 8");
		} else if ('w' == ch || 'x' == ch || 'y' == ch || 'z' == ch) {
			System.out.println("The corresponding number is 9");
		} else {
			System.out.println(ch + " is an invalid input");
		}
	}

}
