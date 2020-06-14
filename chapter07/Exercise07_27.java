package chapter07;

public class Exercise07_27 {
	public static void main(String[] args) {
		int[] a1 = { 5, 2, 6, 1, 6 };
		int a2[] = { 2, 5, 6, 6, 1 };
		System.out.println(equals(a1, a2));

	}

	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length) {
			return false;
		}
		int[] array2 = new int[list1.length];
		int[] array1 = new int[list1.length];
		for (int i = 0; i < list1.length; i++) {
			array1[i] = list1[i];
			array2[i] = list2[i];

		}

		sort(array1);
		sort(array2);
		for (int i = 0; i < list2.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] sort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			int min = numbers[i];
			int minIndex = i;

			for (int j = i + 1; j < numbers.length; j++) {
				if (min > numbers[j]) {
					min = numbers[j];
					minIndex = j;
				}
			}
			numbers[minIndex] = numbers[i];
			numbers[i] = min;
		}

		return numbers;
	}
}
