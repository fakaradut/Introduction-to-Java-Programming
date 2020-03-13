package chapter06;

public class Exercise06_04 {
	public static void main(String[] args) {
		System.out.println(reverse(121288777));
	}

	public static int reverse(int number) {
		int numberOfDigit = 0;
		int temp = number;
		while (number != 0) {
			numberOfDigit++;
			number /= 10;
		}
		String str = "";

		for (int i = 0; i < numberOfDigit; i++) {
			str += temp % 10;
			temp /= 10;
		}

		return Integer.parseInt(str);
	}

}
