package chapter10.Exercise10_28;

import chapter10.Exercise10_27.MyStringBuilder1;

public class MyStringBuilder2 {
	private char[] chars;

	public MyStringBuilder2() {
	}

	public MyStringBuilder2(char[] chars) {
		this.chars = chars;
	}

	public MyStringBuilder2(String s) {
		chars = new char[s.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = s.charAt(i);
		}
	}

	public int length() {
		return chars.length;
	}

	public char[] getChars() {
		char[] newChars = new char[chars.length];
		System.arraycopy(chars, 0, newChars, 0, chars.length);
		return newChars;
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		char[] newChars = new char[s.length() + chars.length];
		int index = 0;
		for (int i = 0; i < offset; i++) {
			newChars[index++] = chars[index];
		}

		for (int i = 0; i < s.length(); i++) {
			newChars[index++] = s.getChars()[i];
		}
		for (int i = 0; i < newChars.length - offset; i++) {
			newChars[index + i] = chars[offset + i];
		}

		return new MyStringBuilder2(newChars);
	}

	public MyStringBuilder2 reverse() {
		char[] reverse = new char[chars.length];
		for (int i = 0, j = reverse.length - 1; i < reverse.length; i++, j--) {
			reverse[i] = chars[j];
		}
		return new MyStringBuilder2(reverse);
	}

	public MyStringBuilder2 substring(int begin) {
		char[] sub = new char[chars.length - begin];
		int index = 0;
		for (int i = begin; i < chars.length; i++) {
			sub[index++] = chars[i];
		}
		return new MyStringBuilder2(sub);
	}

	public MyStringBuilder2 toUpperCase() {
		char[] newChars = new char[chars.length];
		System.arraycopy(chars, 0, newChars, 0, chars.length);
		for (int i = 0; i < chars.length; i++) {
			if ('a' <= chars[i] && chars[i] <= 'z') {
				newChars[i] = (char) (chars[i] - 'a' + 'A');
			}
		}
		return new MyStringBuilder2(newChars);
	}

	public MyStringBuilder2 append(MyStringBuilder2 s) {
		char[] newChars = new char[s.length() + chars.length];
		for (int i = 0; i < chars.length; i++) {
			newChars[i] = chars[i];
		}
		for (int i = 0; i < newChars.length - chars.length; i++) {
			newChars[chars.length + i] = s.getChars()[i];
		}
		return new MyStringBuilder2(newChars);
	}

	public MyStringBuilder2 append(int i) {
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
		return append(new MyStringBuilder2(new String(charsOfNumber)));

	}

	public char charAt(int index) {
		return chars[index];
	}

}
