package chapter07;

public class Exercise07_20 {
	public static void main(String[] args) {
		int[] series = { 0, 5, 8, 6, 3, 4, 3 };
		sort(series);
		for (int i : series) {
			System.out.print(i + " ");
		}
	}

	public static int[] sort(int[] list) {

		for (int i = 0; i <= list.length - 1; i++) {
			int max = list[list.length - 1 - i];
			int maxIndex = list.length - 1 - i;

			for (int j = 0; j < list.length - i; j++) {
				if (list[j] > max) {
					maxIndex = j;
					max = list[j];
				}
			}

			list[maxIndex] = list[list.length - i - 1];
			list[list.length - i - 1] = max;

		}
		return list;
	}
}
