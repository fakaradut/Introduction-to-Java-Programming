package chapter10.Exercise10_23;

public class TestMyString2 {
	public static void main(String[] args) {
		MyString2 str = new MyString2("test string");
		System.out.println(str.compare("Test string"));
		
		char[]ch=str.substring(6).toChars();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		str=str.toUpperCase();
		System.out.println();
		ch=str.toChars();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
