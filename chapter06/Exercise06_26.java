package chapter06;

public class Exercise06_26 {
	public static void main(String[] args) {
		String number = "";
		int count = 0;
		int printCount = 0;

		for (int i = 2; count < 100; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				number = "" + i;
				if (isPalindrom(number)) {
					count++;
					printCount++;
					if (printCount % 10 != 0) {
						System.out.printf("%6d" , i);
					} else {
						System.out.printf("%6d\n" , i);
					}
				}

			}

		}

	}

	public static boolean isPalindrom(String str) {

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
