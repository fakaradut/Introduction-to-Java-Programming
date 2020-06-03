package chapter10.Exercise10_24;

public class MyCharacter {

	private char character;

	public MyCharacter(char character) {
		this.character = character;
	}

	public char charValue() {
		return character;
	}

	public int compareTo(MyCharacter anotherCharacter) {
		return character - anotherCharacter.character;
	}

	public boolean equals(MyCharacter anotherCharacter) {
		return character == anotherCharacter.character;
	}

	public boolean isDigit() {
		return 0 <= character && character <= 9;
	}

	public static boolean isDigit(char character) {
		return character <= '9' && character >= '0';
	}

	public static boolean isLetter(char character) {
		return (character <= 'z' && character >= 'a') || (character <= 'Z' && character >= 'A');
	}

	public static boolean isLetterOrDigit(char character) {
		return isLetter(character) || isDigit(character);
	}

	public static boolean isLowerCase(char character) {
		return (character <= 'z' && character >= 'a');
	}

	public static boolean isUpperCase(char character) {
		return (character <= 'Z' && character >= 'A');
	}

	public static char toUpperCase(char character) {
		if (isLowerCase(character)) {
			return (char) (character - 'a' + 'A');
		} else {
			return character;
		}
	}

	public static char toLowerCase(char character) {
		if (isUpperCase(character)) {
			return (char) (character - 'A' + 'a');
		} else {
			return character;
		}
	}
}
