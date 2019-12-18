package chapter11.Exercise11_01;

import java.util.Date;

public class GeometricObject {
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

	public String toString() {
		return "Color: " + color + " Filled: " + filled + "Date created: " + dateCreated;
	}
}
