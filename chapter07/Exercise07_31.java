package chapter07;

public class Exercise07_31 {
	public static void main(String[] args) {
		int[] mergedArray = merge(new int[] { 1, 5, 16, 61, 11 }, new int[] { 4, 2, 4, 5, 6 });

		for (int i : mergedArray) {
			System.out.print(i + " ");
		}
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] merged = new int[list1.length + list2.length];

		for (int i = 0; i < list1.length; i++) {
			merged[i] = list1[i];
		}
		for (int i = list1.length, j = 0; i < merged.length; i++, j++) {
			merged[i] = list2[j];
		}
		sort(merged);
		return merged;
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
