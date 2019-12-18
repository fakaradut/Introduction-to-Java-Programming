package chapter11.Exercise11_06;

public class Circle {
	private double radius = 1;
	private static int numberOfObjects = 0;

	public Circle() {
		numberOfObjects++;
	}

	public Circle(double radius) {
		this.radius = radius;
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = (radius >= 0) ? radius : 0;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "Radius: " + getRadius() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter()
				+ "\nNumber of circle objects: " + getNumberOfObjects();
	}
}