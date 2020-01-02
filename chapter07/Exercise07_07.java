package chapter07;

public class Exercise07_07 {
	public static void main(String[] args) {
		int[] counts = new int[10];
		

		for (int i = 0; i < 100; i++) {
			int number = getRandomNumber();

			for (int j = 0; j < counts.length; j++) {
				if (number == j) {
					counts[j]++;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + counts[i] + " ");
		}
	}

	public static int getRandomNumber() {
		return (int) (Math.random() * 10);
	}
}