package chapter13.Exercise13_12;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side;

	public Octagon() {
		super();
	}

	public Octagon(double side) {
		super();
		this.side = side;
	}

	@Override
	public int compareTo(Octagon o) {
		if (side > o.getSide()) {
			return 1;
		} else if (side < o.getSide()) {
			return -1;
		}
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		return compareTo(((Octagon) o)) == 0 ? true : false;
	}

	@Override
	public double getArea() {
		return (2 + (4 / Math.sqrt(2))) * Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return side * 8;
	}

	@Override
	public Object clone() {
		try {
			Octagon clone = (Octagon) super.clone();
			return clone;
		} catch (Exception e) {
			return null;
		}
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Side: " + getSide() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + " "
				+ super.toString();
	}
}
