package chapter11.Exercise11_05;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public void dropStudent(String student) {
		students.remove(student);
	}

	public ArrayList<String> getStudents() {
		ArrayList<String> newStudents = new ArrayList<>(students);
		return newStudents;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public void clear() {
		students.clear();
	}
}
