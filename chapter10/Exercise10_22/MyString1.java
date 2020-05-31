package chapter10.Exercise10_22;

public class MyString1 {
	private char chars[];

	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] substring = new char[end - begin];
		int count = 0;
		for (int i = begin; i <= end; i++) {
			substring[count++] = chars[i];
		}
		return new MyString1(substring);
	}

	public MyString1 toLowerCase() {
		char[] string = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			string[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString1(string);
	}

	public boolean equals(MyString1 s) {
		if (s.length() != chars.length) {
			return false;
		}
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static MyString1 valueOf(int i) {
		char[] chars;
		int temp = i;
		int index = 0;
		while (temp != 0) {
			temp /= 10;
			index++;
		}
		chars = new char[index];
		for (int j = 0; j < chars.length; j++) {
			chars[j] = (char) ((i / Math.pow(10, index - j - 1) + '0'));
			i = (int) (i % Math.pow(10, index - j - 1));
		}
		return new MyString1(chars);
	}

	public char[] toChars() {
		char[] newChars = new char[chars.length];
		System.arraycopy(chars, 0, newChars, 0, chars.length);
		return newChars;
	}

}
