package chapter07;

public class Exercise07_13 {
	public static void main(String[] args) {

		int[] array = new int[27];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
		}

		for (int i = 0; i < 100; i++) {

			System.out.println(getRandom(array));
		}
	}

	public static int getRandom(int... numbers) {
		int random = (int) (Math.random() * 54 + 1);
		boolean isMatch = false;

		for (int i = 0; i < numbers.length; i++) {
			isMatch = false;
			if (random == numbers[i]) {
				isMatch = true;
				break;
			}
		}
		if (!isMatch) {
			return random;
		} else {
			return getRandom(numbers);

		}

	}
}
