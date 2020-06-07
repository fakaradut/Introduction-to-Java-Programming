package chapter10.Exercise10_28;

public class TestMyStringBuilder2 {

	public static void main(String[] args) {
		MyStringBuilder2 s1 = new MyStringBuilder2(new char[] { 'a', 'b', 'c', 'd', 'p' });
		MyStringBuilder2 s2 = new MyStringBuilder2("xyz");

		System.out.println(s1.length());
		System.out.println(s1.charAt(3));

		MyStringBuilder2 s = s2.append(123456789);
		print(s);

		s = s1.substring(2);
		print(s);

		s = s1.reverse();
		print(s);

		s = s1.toUpperCase();
		print(s);
	}

	public static void print(MyStringBuilder2 s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.getChars()[i]);
		}
		System.out.println();
	}
}
