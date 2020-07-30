package chapter18;

public class Exercise18_11 {

	public static void main(String[] args) {
		System.out.println(sumDigits(159));
	}

	public static int sumDigits(long n) {
		int sum = 0;
		if (n > 0)
			sum += sumDigits(n / 10) + n % 10;
		return sum;
	}
}
