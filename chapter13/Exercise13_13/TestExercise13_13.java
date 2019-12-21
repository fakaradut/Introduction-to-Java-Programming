package chapter13.Exercise13_13;

import java.util.ArrayList;

public class TestExercise13_13 {

	public static void main(String[] args) {
		Course c1 = new Course("Computer Engineerig");
		c1.addStudent("Daniel");
		c1.addStudent("Liang");
		c1.addStudent("Steve");
		

		Course clone = (Course) c1.clone();
		c1.dropStudent("Liang");
		ArrayList<String> students = clone.getStudents();

		for (String string : students) {
			System.out.println(string);
		}
	}

}
