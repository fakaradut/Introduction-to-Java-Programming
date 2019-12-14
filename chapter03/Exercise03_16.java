package chapter03;

public class Exercise03_16 {
	public static void main(String[] args) {
		int heigtOfRectangle = 200;
		int weigtOfRectangle = 100;
		int xCenterPointOfRectangle = 0;
		int yCenterPointOfRectangle = 0;

		int xOfrandomPoint = (int) (Math.pow(-1, (int) (Math.random() * 2)))
				* ((int) (Math.random() * (weigtOfRectangle / 2)));

		int yOfrandomPoint = (int) (Math.pow(-1, (int) (Math.random() * 2)))
				* ((int) (Math.random() * (heigtOfRectangle / 2)));
		System.out.println("Random point is (" + (xCenterPointOfRectangle + xOfrandomPoint) + ","
				+ (yCenterPointOfRectangle + yOfrandomPoint) + ")");
	}
}
