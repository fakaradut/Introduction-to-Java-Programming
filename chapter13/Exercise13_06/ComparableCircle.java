package chapter13.Exercise13_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	public ComparableCircle(double radius) {
		super(radius);
	}

	@Override
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else
			return 2;
	}

}
