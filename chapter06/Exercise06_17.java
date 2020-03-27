package chapter06;

public class Exercise06_17 {
	public static void main(String[] args) {
		printMatrix(3);
	}

	public static void printMatrix(int n) {
		String matrix = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				matrix += (int) (Math.random() * 2) + " ";
			}
			matrix += "\n";
		}
		System.out.println(matrix);
	}
}
