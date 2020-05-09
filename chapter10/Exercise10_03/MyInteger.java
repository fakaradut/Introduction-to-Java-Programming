package chapter10.Exercise10_03;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public boolean isEven() {
		return value % 2 == 0 ? true : false;
	}

	public boolean isOdd() {
		return value % 2 != 0 ? true : false;
	}

	public boolean isPrime() {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int value) {
		return value % 2 == 0 ? true : false;
	}

	public static boolean isOdd(int value) {
		return value % 2 != 0 ? true : false;
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isEven(MyInteger m) {
		return m.value % 2 == 0 ? true : false;
	}

	public boolean isOdd(MyInteger m) {
		return m.value % 2 != 0 ? true : false;
	}

	public boolean isPrime(MyInteger m) {
		for (int i = 2; i < m.value / 2; i++) {
			if (m.value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int value) {
		return this.value == value ? true : false;
	}

	public boolean equals(MyInteger m) {
		return m.value == value ? true : false;
	}

	public static int parseInt(char[] a) {
		int number = 0;
		for (int i = 0; i < a.length; i++) {
			number = (int) (number * 10 + (a[i] - '0'));
		}
		return number;
	}

	public int getValue() {
		return value;
	}
}
