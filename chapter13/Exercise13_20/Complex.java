package chapter13.Exercise13_20;

public class Complex implements Cloneable {
	private double a;
	private double b;

	public Complex() {
		this(0, 0);
	}

	public Complex(double a) {
		this(a, 0);
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Complex add(Complex c) {
		double a = getRealPart() + c.getRealPart();
		double b = getImaginaryPart() + c.getImaginaryPart();
		return new Complex(a, b);
	}

	public Complex subtract(Complex c) {
		double a = getRealPart() - c.getRealPart();
		double b = getImaginaryPart() - c.getImaginaryPart();
		return new Complex(a, b);
	}

	public Complex multiply(Complex c) {
		double a = getRealPart() * c.getRealPart() - getImaginaryPart() * c.getImaginaryPart();
		double b = getImaginaryPart() * c.getRealPart() + getRealPart() * c.getImaginaryPart();
		return new Complex(a, b);
	}

	public Complex divide(Complex c) {
		double a = (getRealPart() * c.getRealPart() + getImaginaryPart() * c.getImaginaryPart())
				/ (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));
		double b = (getImaginaryPart() * c.getRealPart() - getRealPart() * c.getImaginaryPart())
				/ (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));
		return new Complex(a, b);
	}

	public double abs() {
		return Math.sqrt(Math.pow(getRealPart(), 2) + Math.pow(getImaginaryPart(), 2));
	}

	public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;
	}

	@Override
	public Complex clone() {
		try {
			return (Complex) super.clone();
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public String toString() {
		return "(" + getRealPart() + " + " + getImaginaryPart() + "i)";
	}
}
