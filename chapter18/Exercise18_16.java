package chapter18;

import java.util.Scanner;

public class Exercise18_16 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			System.out.print("Enter a string: ");
			String s = input.nextLine();
			int times = count(s.toCharArray());
			System.out.println("Uppercase letter"+(times > 1 ? "s" : "") +" appears " + times + (times > 1 ? " times " : " time ") + "in " + s);
		}
	}

	public static int count(char[] chars) {
		return count(chars, 0);
	}

	public static int count(char[] chars, int high) {
		int result = 0;
		if (chars.length > high)
			result += count(chars, high+1) + (('A' <= chars[high] && chars[high] <= 'Z') ? 1 : 0);
		return result;
	}

}
