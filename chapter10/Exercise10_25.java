package chapter10;

public class Exercise10_25 {
	public static void main(String[] args) {
		String[] list = split("12%f as%sf3sad asdalsda ýsdf as%as%d", "[as]");
		for (String string : list) {
			System.out.println(string);
		}

	}

	public static String[] split(String s, String regex) {
		char[] regexArray;
		if (regex.charAt(0) == '[') {
			regexArray = new char[regex.length() - 2];
			for (int i = 0; i < regexArray.length; i++) {
				regexArray[i] = regex.charAt(i + 1);
			}
		} else {
			regexArray = new char[regex.length()];
			for (int i = 0; i < regexArray.length; i++) {
				regexArray[i] = regex.charAt(i);
			}
		}
		int size = 0;
		String[] stringArray = new String[s.length()];
		boolean[] regexIndex = new boolean[stringArray.length];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < regexArray.length; j++) {
				if (s.charAt(i) == regexArray[j]) {
					regexIndex[i] = true;
					break;
				}
			}
			if (i == 0) {
				stringArray[size] = s.charAt(i) + "";
			} else if (i > 0 && regexIndex[i]) {
				if (regexIndex[i - 1]) {
					stringArray[size++] = s.charAt(i) + "";
				} else {
					stringArray[++size] = s.charAt(i) + "";
					size++;
				}
			} else {
				String temp = stringArray[size];
				stringArray[size] = temp == null ? s.charAt(i) + "" : temp + s.charAt(i);
			}
		}
		String[] array = new String[size + regexArray.length-1];
		System.arraycopy(stringArray, 0, array, 0, array.length);
		return array;
	}
}
