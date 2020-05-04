<<<<<<< HEAD
package chapter08;

public class Exercise08_08 {
	public static void main(String[] args) {
		printClosestPoints(
				new int[][] { { 0, 0 }, { 1, 1 }, { -1, -1 }, { 2, 2 }, { -2, -2 }, { -3, -3 }, { -4, -4 }, { 5, 5 } });
	}

	public static void printClosestPoints(int[][] list) {
		String str = "";

		double minDistance = Double.MAX_VALUE;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				double currentDistance = distance(list[i][0], list[i][1], list[j][0], list[j][0]);
				if (currentDistance <= minDistance) {
					if (currentDistance == minDistance) {
						str += "The closest two points are: (" + list[i][0] + "," + list[i][1] + ") and (" + list[j][0]
								+ "," + list[j][0] + ")\n";
					} else {
						str = "The closest two points are: (" + list[i][0] + "," + list[i][1] + ") and (" + list[j][0]
								+ "," + list[j][0] + ")\n";
					}
					minDistance = currentDistance;
				}
			}
		}
		System.out.println(str + "\nThe distance is: " + minDistance);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
=======
package chapter08;

public class Exercise08_08 {
	public static void main(String[] args) {
		printClosestPoints(
				new int[][] { { 0, 0 }, { 1, 1 }, { -1, -1 }, { 2, 2 }, { -2, -2 }, { -3, -3 }, { -4, -4 }, { 5, 5 } });
	}

	public static void printClosestPoints(int[][] list) {
		String str = "";

		double minDistance = Double.MAX_VALUE;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				double currentDistance = distance(list[i][0], list[i][1], list[j][0], list[j][0]);
				if (currentDistance <= minDistance) {
					if (currentDistance == minDistance) {
						str += "The closest two points are: (" + list[i][0] + "," + list[i][1] + ") and (" + list[j][0]
								+ "," + list[j][0] + ")\n";
					} else {
						str = "The closest two points are: (" + list[i][0] + "," + list[i][1] + ") and (" + list[j][0]
								+ "," + list[j][0] + ")\n";
					}
					minDistance = currentDistance;
				}
			}
		}
		System.out.println(str + "\nThe distance is: " + minDistance);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
>>>>>>> 7af1d9968804c80cea04654b9c2daefeb8630261
