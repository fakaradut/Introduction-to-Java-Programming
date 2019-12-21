package chapter13.Exercise13_12;

public class Exercise13_12 {

	public static void main(String[] args) {

		GeometricObject[] a = new GeometricObject[5];

		a[0] = new Rectangle(5, 4);
		a[1] = new Triangle(5, 5, 6);
		a[2] = new Circle(4);
		a[3] = new Octagon(7);
		a[4] = new Rectangle(3, 4);

		System.out.println("Sum of areas is " + sum(a));

	}

	public static double sum(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}
}
