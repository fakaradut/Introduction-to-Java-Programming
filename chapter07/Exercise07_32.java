package chapter07;

public class Exercise07_32 {
	public static void main(String[] args) {
		int[] list = { 10, 1, 5, 16, 61, 9, 11, 1 };

		System.out.println(partition(list));
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	public static int partition(int[] list) {
		int pivot = list[0];
		int lowCount = 0;

		for (int i = 1; i < list.length; i++) {
			if (list[i] <= pivot) {

				lowCount++;
			}
		}
		list[0] = list[lowCount];
		list[lowCount] = pivot;
		int pivotIndex = lowCount;

		for (int i = 0; i < lowCount; i++) {
			if (i != pivotIndex && pivot < list[i]) {
				for (int j = i + 1; j < list.length; j++) {
					if (j != pivotIndex && list[j] <= pivot) {
						int temp = list[j];
						list[j] = list[i];
						list[i] = temp;
						break;
					}
				}
			}
		}

		return pivotIndex;
	}
}
