package chapter05;

import java.util.Scanner;

public class Exercise05_49 {

	public static void main(String[] args) {

		int consonant = 0;
		int vowel = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine().toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
				vowel++;
				break;
			case 'e':
				vowel++;
				break;
			case 'i':
				vowel++;
				break;
			case 'o':
				vowel++;
				break;
			case 'u':
				vowel++;
				break;
			case ' ':
				break;
			default:
				consonant++;
				break;
			}

		}
		System.out.println("The number of vowels is " + vowel + "\nThe number of consonants is " + consonant);

	}

}
