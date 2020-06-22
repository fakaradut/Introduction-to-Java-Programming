package chapter07;

import java.util.Scanner;

public class Exercise07_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String str = input.nextLine();
		System.out.println(sort(str));

	}

	public static String sort(String s) {
		int[] list = new int[Byte.MAX_VALUE];

		for (int i = 0; i < s.length(); i++) {
			list[s.charAt(i)]++;
		}
		s = "";
		for (int i = 0; i < list.length; i++) {
			if (list[i] > 0) {
				for (int j = 0; j < list[i]; j++) {
					s += (char) (i);
				}
			}
		}

		return s;
	}
}
