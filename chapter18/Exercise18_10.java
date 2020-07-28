package chapter18;

import java.util.Scanner;

public class Exercise18_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string and a character: ");
		String[] inputs = input.nextLine().split("[ ]");
		String str = inputs[0];
		char a = inputs[1].charAt(0);
		System.out.println("The number of occurences of the character " + a + " is = " + count(str, a));
		input.close();
	}

	public static int count(String str, char a) {
		int count = 0;
		while (str.contains(a + "")) {
			count++;
			str = str.substring(str.indexOf(a) + 1);
		}
		return count;
	}

}
