package chapter12.Exercise12_05;

public class IllegalTriangleException extends Exception {

	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Must be the sum of any two sides is greater than the other side");
	}
}
