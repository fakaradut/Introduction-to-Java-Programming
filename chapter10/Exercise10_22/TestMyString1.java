package chapter10.Exercise10_22;

public class TestMyString1 {
	public static void main(String[] args) {
		char[] chars = new char[] { 'a', 'b', 'c' };
		MyString1 s = new MyString1(chars);
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.equals(new MyString1(new char[] { 'a', 'b', 'c' })));

		char[] newChars = MyString1.valueOf(345).toChars();
		for (int i = 0; i < newChars.length; i++) {
			System.out.print(newChars[i]);
		}
	}
}
