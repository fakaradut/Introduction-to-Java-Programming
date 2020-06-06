package chapter10.Exercise10_27;

public class MyStringBuilder1 {
	private char[] chars;

	public MyStringBuilder1(String s) {
		chars = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		char[] newChars = new char[s.length() + chars.length];
		for (int i = 0; i < chars.length; i++) {
			newChars[i] = chars[i];
		}
		for (int i = 0; i < newChars.length - chars.length; i++) {
			newChars[chars.length+i] = s.charAt(i);
		}
		return new MyStringBuilder1(new String(newChars));
	}

	public MyStringBuilder1 append(int i) {
		char[] charsOfNumber;
		int temp = i;
		int index = 0;
		while (temp != 0) {
			temp /= 10;
			index++;
		}
		charsOfNumber = new char[index];
		for (int j = 0; j < charsOfNumber.length; j++) {
			charsOfNumber[j] = (char) ((i / Math.pow(10, index - j - 1) + '0'));
			i = (int) (i % Math.pow(10, index - j - 1));
		}
		return append(new MyStringBuilder1(new String(charsOfNumber)));

	}

	public int length() {
		return chars.length;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public MyStringBuilder1 toLowerCase() {
		String str = "";
		for (int i = 0; i < chars.length; i++) {
			str += Character.toLowerCase(chars[i]);
		}
		return new MyStringBuilder1(str);
	}

	public MyStringBuilder1 substring(int begin, int end) {
		String substring = "";
		int index = begin;
		for (int i = 0; i <= end - begin; i++) {
			substring += chars[index++];
		}
		return new MyStringBuilder1(substring);
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < chars.length; i++) {
			s += chars[i];
		}
		return s;
	}
}
