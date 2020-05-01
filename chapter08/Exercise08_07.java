package chapter08;

public class Exercise08_07 {
	public static void main(String[] args) {
		double[][] points = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 },
				{ -1.5, 4, 2 }, { 5.5, 4, -0.5 } };

		double minDistance = Double.MAX_VALUE;
		String str = "";

		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
						points[j][2]);
				if (distance < minDistance) {
					minDistance = distance;
					str = "(" + points[i][0] + "," + points[i][1] + "," + points[i][2] + ") and (" + points[j][0] + ","
							+ points[j][1] + "," + points[j][2] + ") are closest points\nDistance is: " + distance;
				}
			}
		}
		System.out.println(str);

	}

	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		return distance;
	}
}
