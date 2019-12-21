package chapter13.Exercise13_11;

public class TestExercise13_11 {

	public static void main(String[] args) {

		Octagon o = new Octagon(5);
		System.out.println(o);

		Octagon clone = (Octagon) o.clone();

		System.out.println("Equals ? " + (o.compareTo(clone) == 0 ? true : false));
	}

}
