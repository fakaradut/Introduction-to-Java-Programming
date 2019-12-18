package chapter12.Exercise12_05;

public class TestExercise12_05 {
	public static void main(String[] args) {

		try {
			new Triangle(1, 8, 1);

		} catch (IllegalTriangleException e) {
			System.out.println(e);
		}
	}
}
