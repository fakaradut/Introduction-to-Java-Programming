package chapter10.Exercise10_23;

public class MyString2 {
	private String s;

	public MyString2(String s) {
		this.s = s;
	}

	public int compare(String s) {
		if (s.length() != this.s.length()) {
			return this.s.length() - s.length();
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != this.s.charAt(i)) {
				return this.s.charAt(i) - s.charAt(i);
			}
		}
		return 0;
	}

	public MyString2 substring(int begin) {
		String s = "";
		int index=begin;
		for (int i = 0; i < this.s.length() - begin ; i++) {
			s += this.s.charAt(index++);
		}
		return new MyString2(s);
	}

	public MyString2 toUpperCase() {
		String s = "";
		for (int i = 0; i < this.s.length(); i++) {
			s += Character.toUpperCase(this.s.charAt(i));
		}
		return new MyString2(s);
	}

	public char[] toChars() {
		char[] chars = new char[s.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = s.charAt(i);
		}
		return chars;
	}

	public static MyString2 valueOf(boolean b) {
		if (b == true) {
			return new MyString2("true");
		} else {
			return new MyString2("false");
		}
	}
}
