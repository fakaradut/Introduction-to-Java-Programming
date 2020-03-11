package chapter06;

public class Exercise06_03 {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	public static int reverse(int number) {
		String str = "";
		while (number != 0) {
			str += number % 10;
			number /= 10;
		}
		return Integer.parseInt(str);
	}

	public static boolean isPalindrome(int number) {
		return (number == reverse(number)) ? (true) : (false);

	}

}
