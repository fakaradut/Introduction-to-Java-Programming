package chapter10.Exercise10_09;

public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	public static final int NUMBER_OF_STUDENTS = 10;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new String[10];
		numberOfStudents = 0;
	}

	public String getCourseName() {
		return courseName;
	}

	public void addStudent(String student) {
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, NUMBER_OF_STUDENTS);
			students = temp;
		}
		students[numberOfStudents++] = student;
	}

	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (student.equals(students[i])) {
				for (int j = i; j < numberOfStudents; j++) {
					students[j] = students[j + 1];
				}
				numberOfStudents--;
				break;
			}
		}

	}

	public String[] getStudents() {
		String[] temp = new String[numberOfStudents];
		System.arraycopy(students, 0, temp, 0, numberOfStudents);
		return temp;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void clear() {
		students = new String[NUMBER_OF_STUDENTS];
	}
}
