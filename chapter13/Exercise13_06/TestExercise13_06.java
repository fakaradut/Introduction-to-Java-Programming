package chapter13.Exercise13_06;

public class TestExercise13_06 {

	public static void main(String[] args) {
		ComparableCircle circle1 = new ComparableCircle(36);
		ComparableCircle circle2 = new ComparableCircle(15);

		ComparableCircle maxCircle = (ComparableCircle) Max.max(circle1, circle2);
		System.out.println("The max circle's radius: " + maxCircle.getRadius());
		System.out.println("\nMax circle is\n" + maxCircle);

	}
}

class Max {
	public static ComparableCircle max(ComparableCircle o1, ComparableCircle o2) {
		if (o1.getArea() > o2.getArea()) {
			return o1;
		} else {
			return o2;
		}
	}
}