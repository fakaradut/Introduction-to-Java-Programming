package chapter06;

public class Exercise06_23 {
public static void main(String[] args) {
	System.out.println(count("merhabAAAAaaa", 'a'));
}
	public static int count(String str, char a) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}
}
