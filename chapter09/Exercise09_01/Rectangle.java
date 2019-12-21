package chapter09.Exercise09_01;

public class Rectangle {
	double width;
	double height;

	public Rectangle() {
		this(1, 1);
	}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return height * 2 + width * 2;
	}
}
