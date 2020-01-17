package chapter07;

public class Exercise07_18 {
	public static void main(String[] args) {

		double array[] = { 11, 9, 8, 10, 2, 0, 4, 3, 6, 5, 1, 7, 10 };

		bubbleSort(array);

		for (double i : array) {
			System.out.print(i + " ");
		}

	}

	public static double[] bubbleSort(double[] list) {
		boolean isChanged;

		do {
			isChanged = false;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {
					double temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					isChanged = true;
				}
			}
		} while (isChanged);

		return list;
	}

}
