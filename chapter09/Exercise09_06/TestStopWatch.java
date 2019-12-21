package chapter09.Exercise09_06;

public class TestStopWatch {
	public static void main(String[] args) {
		final int NUMBER_OF_LÝST = 100_000;
		int list[] = new int[NUMBER_OF_LÝST];
		StopWatch watch = new StopWatch();

		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * NUMBER_OF_LÝST);
		}
		watch.start();
		selectionSort(list);
		watch.stop();

		System.out.println(watch.getElapsedTime() > 1 ? watch.getElapsedTime() + " milliseconds"
				: watch.getElapsedTime() + " millisecond");

	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}
}
