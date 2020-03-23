package chapter06;

public class Exercise06_12 {

	public static void main(String[] args) {
		printChars('!', 'z', 10);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int characterCount = 1;

		int lowerCharacter = Math.min(ch1, ch2);
		int upperCharacter = Math.max(ch1, ch2);

		for (int i = lowerCharacter; i <= upperCharacter; i++, characterCount++) {

			 if (characterCount % (numberPerLine) == 0) {
				System.out.println((char)i);
			} else {
				System.out.print((char) i + " ");

			}
		}
	}
}
