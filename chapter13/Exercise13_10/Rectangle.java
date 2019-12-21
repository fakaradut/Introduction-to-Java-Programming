package chapter13.Exercise13_10;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height + "\nArea: " + getArea() + "\nPerimeter: "
				+ getPerimeter();
	}

	@Override
	public int compareTo(Rectangle o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		}
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		return compareTo((Rectangle) o) == 0 ? true : false;
	}
}