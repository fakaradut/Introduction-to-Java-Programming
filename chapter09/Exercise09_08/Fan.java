package chapter09.Exercise09_08;

public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;

	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "Blue";
	}

	public String toString() {
		return isOn() == true ? "Speed:" + getSpeed(this.speed) + "\nRadius: " + radius + "\nColor: " + color
				: "Color: " + color + "\nRadius: " + radius + " fan is off";
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getSpeed(int speed) {
		if (speed == FAST)
			return "Fast";
		else if (speed == MEDIUM)
			return "Medium";
		else if (speed == SLOW)
			return "Slow";
		else
			return null;
	}
}
