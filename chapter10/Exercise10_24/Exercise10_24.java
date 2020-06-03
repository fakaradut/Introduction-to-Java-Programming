package chapter10.Exercise10_24;

public class Exercise10_24 {
	public static void main(String[] args) {
		MyCharacter character = new MyCharacter('A');
		System.out.println(character.isDigit());
		System.out.println(MyCharacter.isDigit('5'));
		System.out.println(MyCharacter.isLowerCase(character.charValue()));
		System.out.println(MyCharacter.toLowerCase(character.charValue()));
	}
}
