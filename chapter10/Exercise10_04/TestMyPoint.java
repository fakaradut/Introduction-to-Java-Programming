package chapter10.Exercise10_04;

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);

		System.out.println("Distance between point (" + p1.getX() + "," + p1.getY() + ") and point (" + p2.getX() + ","
				+ p2.getY() + ") is: " + p1.distance(p2));

	}
}
