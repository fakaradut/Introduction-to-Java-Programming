package chapter13.Exercise13_05;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color;
	private boolean filled;
	private Date dateCreated;

	public GeometricObject() {
		this("White", false);
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) == 1) {
			return o1;
		} else {
			return o2;
		}
	}

	@Override
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() == o.getArea()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Color: " + color + " Filled: " + filled + "Date created: " + dateCreated;
	}
}
