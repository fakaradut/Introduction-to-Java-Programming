package chapter13.Exercise13_10;

public class TestExercise13_10 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(5, 10);
		Rectangle r3 = new Rectangle(55, 100);

		System.out.println(r1.compareTo(r2));
		System.out.println(r1.equals(r2));

		System.out.println(r1.compareTo(r3));
		System.out.println(r1.equals(r3));
	}
}
