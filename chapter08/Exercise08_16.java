package chapter08;

public class Exercise08_16 {
	public static void main(String[] args) {
		int[][] list = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		sort(list);
		printList(list);
	}

	public static void sort(int m[][]) {
		for (int i = 0; i < m.length - 1; i++) {
			int[] min = m[i];
			for (int j = i + 1; j < m.length; j++) {
				if (min[0] > m[j][0]) {
					m[i] = m[j];
					m[j] = min;
				} else if (min[0] == m[j][0] && min[1] > m[j][1]) {
					m[i] = m[j];
					m[j] = min;
				}
				min = m[i];
			}
		}
	}

	public static void printList(int[][] list) {
		for (int[] is : list) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
