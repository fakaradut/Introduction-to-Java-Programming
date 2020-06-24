package chapter07;

public class Exercise07_16 {
	public static void main(String[] args) {
		int[] array = new int[1_000_000];
		for (int i = 0; i < 1_000_000; i++) {
			array[i] = (int) (Math.random() * 1_000_000);
		}
		int key = (int) (Math.random() * 1_000_000);

		long startTime = System.currentTimeMillis();
		linearSearch(array, key);
		long endTime = System.currentTimeMillis();
		System.out.println("Linear search: " + (endTime - startTime) + " miliseconds");

		java.util.Arrays.sort(array);
		startTime = System.currentTimeMillis();
		binarySearch(array, key);
		endTime = System.currentTimeMillis();
		System.out.println("Binary search: " + (endTime - startTime) + " miliseconds");
	}

	public static int binarySearch(int[] array, int key) {

		int low = 0;
		int high = array.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < array[mid])
				high = mid - 1;
			else if (key == array[mid])
				return mid;
			else
				low = mid + 1;
		}

		return -1;
	}

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}
}

