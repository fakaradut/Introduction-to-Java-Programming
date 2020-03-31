package chapter06;

import java.util.Scanner;

public class Exercise06_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = input.nextLine();

		String str = "";
		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i))) {
				str += getNumber(s.charAt(i));
			} else {
				char temp = (char) s.charAt(i);
				str += temp;
			}
		}

		System.out.println(str);
	}

	public static int getNumber(char uppercaseLetter) {
		uppercaseLetter = Character.toUpperCase(uppercaseLetter);
		if (65 <= uppercaseLetter && uppercaseLetter <= 67) {
			return 2;
		} else if (68 <= uppercaseLetter && uppercaseLetter <= 70) {
			return 3;
		} else if (71 <= uppercaseLetter && uppercaseLetter <= 73) {
			return 4;
		} else if (74 <= uppercaseLetter && uppercaseLetter <= 76) {
			return 5;
		} else if (77 <= uppercaseLetter && uppercaseLetter <= 79) {
			return 6;
		} else if (80 <= uppercaseLetter && uppercaseLetter <= 83) {
			return 7;
		} else if (84 <= uppercaseLetter && uppercaseLetter <= 86) {
			return 8;
		} else if (87 <= uppercaseLetter && uppercaseLetter <= 90) {
			return 9;
		} else {
			return uppercaseLetter;
		}

	}
}
