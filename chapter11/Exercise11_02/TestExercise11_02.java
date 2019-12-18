package chapter11.Exercise11_02;

public class TestExercise11_02 {
	public static void main(String[] args) {
		String name = "Jon Doe";
		String adress = "Adress";
		String phoneNumber = "0 555 555 55";
		String emailAdress = "blabla@blabla";
		String office = "Silicon valley";
		double salary = 20_000;
		int officeHours = 7;
		String rank = "Dean";
		int status = Student.SENIOR;
		String title = "Janitor";

		Person p = new Person(name + " Person", adress, phoneNumber, emailAdress);
		Student st = new Student(name + " Student", adress, phoneNumber, emailAdress, status);
		Employee e = new Employee(name + " Employee", adress, phoneNumber, emailAdress, office, salary);
		Faculty f = new Faculty(name + " Faculty", adress, phoneNumber, emailAdress, office, salary, officeHours, rank);
		Staff s = new Staff(name + " Staff", adress, phoneNumber, emailAdress, office, salary, title);

		System.out.println(p.toString());
		System.out.println("\n-------------------");
		System.out.println(st.toString());
		System.out.println("\n-------------------");
		System.out.println(e.toString());
		System.out.println("\n-------------------");
		System.out.println(f.toString());
		System.out.println("\n-------------------");
		System.out.println(s.toString());

	}
}
