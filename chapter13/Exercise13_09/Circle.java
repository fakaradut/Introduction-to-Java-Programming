package chapter13.Exercise13_09;

public class Circle extends GeometricObject implements Comparable<Circle> {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nDiameter: " + getDiameter()
				+ "\nPerimeter: " + getPerimeter();
	}

	@Override
	public int compareTo(Circle o) {
		if (getRadius() > o.getRadius()) {
			return 1;
		} else if (getRadius() == o.getRadius()) {
			return 0;
		}
		return -1;
	}

	@Override
	public boolean equals(Object o) {
		if (getRadius() == ((Circle) o).getRadius()) {
			return true;
		}
		return false;
	}

}