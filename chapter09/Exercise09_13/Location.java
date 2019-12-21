package chapter09.Exercise09_13;

public class Location {
	public int row;
	public int column;
	public double maxValue;

	public static Location locateLargest(double[][] a) {
		Location location = new Location();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > location.maxValue) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}

		return location;
	}

}
