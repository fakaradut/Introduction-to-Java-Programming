package chapter10.Exercise10_15;

public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean contains(double x, double y) {
		double top = this.y + (height / 2.);
		double bottom = this.y - (height / 2.);
		double right = this.x + (width / 2.);
		double left = this.x - (width / 2.);
		if (x < left || x > right || y < bottom || y > top) {
			return false;
		} else {
			return true;
		}
	}

	public boolean contains(MyRectangle2D r) {
		double top = r.getY() + (r.getHeight() / 2.);
		double bottom = r.getY() - (r.getHeight() / 2.);
		double right = r.getX() + (r.getWidth() / 2.);
		double left = r.getX() - (r.getWidth() / 2.);
		if (!contains(right, top) || !contains(right, bottom) || !contains(left, bottom) || !contains(left, top)) {
			return false;
		} else {
			return true;
		}
	}

	public boolean overlaps(MyRectangle2D r) {
		double top = r.getY() + (r.getHeight() / 2);
		double bottom = r.getY() - (r.getHeight() / 2);
		double right = r.getX() + (r.getWidth() / 2);
		double left = r.getX() - (r.getWidth() / 2);

		int count = 0;
		if (contains(right, top) || contains(right, bottom) || contains(left, bottom) || contains(left, top)) {
			count++;
		}
		return 0 < count && count < 4 ? true : false;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
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
}
