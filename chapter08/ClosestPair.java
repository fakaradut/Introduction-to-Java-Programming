<<<<<<< HEAD
package chapter08;

public class ClosestPair {

	public static void main(String[] args) {
		double[][] coordinates = { { -1, 3 }, { -1, -1 }, { 1, 1 }, { 2, 0.5 }, { 2, -1 }, { 3, 3 }, { 4, 2 },
				{ 4, -0.5 } };
		findClosestPair(coordinates);
	}

	public static void findClosestPair(double[][] xy) {
		double closestRange = Double.MAX_VALUE;
		String pair = "";
		for (int i = 0; i < xy.length - 1; i++) {
			for (int j = i+1; j < xy.length; j++) {
				if (range(xy[i][0], xy[i][1], xy[j][0], xy[j][1]) < closestRange) {
					closestRange = range(xy[i][0], xy[i][1], xy[j][0], xy[j][1]);
					pair = "Closest two point is: " + "(" + xy[i][0] + "," + xy[i][1] + ") and (" + xy[j][0] + "," + xy[j][1]
							+ ")";
				}
			}
		}
		System.out.println(pair + "\nRange is: " + closestRange);
	}

	public static double range(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
	}

}
=======
package chapter08;

public class ClosestPair {

	public static void main(String[] args) {
		double[][] coordinates = { { -1, 3 }, { -1, -1 }, { 1, 1 }, { 2, 0.5 }, { 2, -1 }, { 3, 3 }, { 4, 2 },
				{ 4, -0.5 } };
		findClosestPair(coordinates);
	}

	public static void findClosestPair(double[][] xy) {
		double closestRange = Double.MAX_VALUE;
		String pair = "";
		for (int i = 0; i < xy.length - 1; i++) {
			for (int j = i+1; j < xy.length; j++) {
				if (range(xy[i][0], xy[i][1], xy[j][0], xy[j][1]) < closestRange) {
					closestRange = range(xy[i][0], xy[i][1], xy[j][0], xy[j][1]);
					pair = "Closest two point is: " + "(" + xy[i][0] + "," + xy[i][1] + ") and (" + xy[j][0] + "," + xy[j][1]
							+ ")";
				}
			}
		}
		System.out.println(pair + "\nRange is: " + closestRange);
	}

	public static double range(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
	}

}
>>>>>>> 7af1d9968804c80cea04654b9c2daefeb8630261
