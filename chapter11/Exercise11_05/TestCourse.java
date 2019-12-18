package chapter11.Exercise11_05;

import java.util.ArrayList;

public class TestCourse {
	public static void main(String[] args) {
		Course c1 = new Course("Math");
		c1.addStudent("John");
		c1.addStudent("Jon");
		c1.addStudent("Joe");

		c1.dropStudent("Joe");

		ArrayList<String> students = c1.getStudents();
		for (String string : students) {
			System.out.println(string);
		}
	}
}
