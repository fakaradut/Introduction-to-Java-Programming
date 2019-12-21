package chapter13.Exercise13_07;

public class Square extends GeometricObject implements Colorable {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}

	@Override
	public double getArea() {
		return Math.pow(side, 4);
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Sides are: " + getSide() + "\nArea is:" + getArea() + "\nPerimeter is: " + getPerimeter() + "\n"
				+ super.toString();
	}

}
