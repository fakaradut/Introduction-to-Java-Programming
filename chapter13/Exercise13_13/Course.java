package chapter13.Exercise13_13;

import java.util.ArrayList;

public class Course implements Cloneable {

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

	@Override
	public Object clone() {
		try {
			Course clone = (Course) super.clone();
			clone.students = (ArrayList<String>) students.clone();
			return clone;
		} catch (Exception e) {
			return null;
		}

	}
}
