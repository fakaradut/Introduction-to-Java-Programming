package chapter10.Exercise10_06;

public class DisplayPrimeNumbers {
	public static void main(String[] args) {
		StackOfIntegers st = new StackOfIntegers();
		for (int i = 2; i <= 120; i++) {
			if (isPrime(i)) {
				st.push(i);
			}
		}
		int end = st.getSize();
		for (int i = 0; i < end; i++) {
			System.out.print(st.peek() + " " + ((i + 1) % 10 == 0 ? "\n" : ""));
			st.pop();
		}
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
