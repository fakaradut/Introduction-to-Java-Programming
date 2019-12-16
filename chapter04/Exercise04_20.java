package chapter04;

import java.util.Scanner;

public class Exercise04_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = input.nextLine();
		System.out.println("String's length is : "+s.length());
		System.out.println("String's first character is \'"+s.charAt(0)+"\'");
	}

}
