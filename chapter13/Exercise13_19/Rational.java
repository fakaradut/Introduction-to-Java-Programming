package chapter13.Exercise13_19;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
	private BigInteger numerator;
	private BigInteger denominator;

	public Rational() {
		this(0, 1);
	}

	public Rational(long numerator, long denominator) {
		this(new BigInteger(numerator + ""), new BigInteger(denominator + ""));
	}

	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = new BigInteger(numerator.divide(gcd).multiply(
				(denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : new BigInteger(-1 + "")) + "");
		this.denominator = new BigInteger(denominator.abs().divide(gcd) + "");
	}

	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;

		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
			if (n1.mod(k).equals(BigInteger.ZERO) && n2.mod(k).equals(BigInteger.ZERO))
				gcd = k;
		}
		return gcd;
	}

	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	public Rational subtract(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	public Rational multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	public Rational divide(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator.toString() + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	public boolean equals(Object other) {
		if ((this.subtract((Rational) (other))).getNumerator().equals(BigInteger.ZERO))
			return true;
		else
			return false;
	}

	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	public double doubleValue() {
		return numerator.doubleValue() / denominator.doubleValue();
	}

	@Override
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}
}