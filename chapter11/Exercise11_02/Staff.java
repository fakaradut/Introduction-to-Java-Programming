package chapter11.Exercise11_02;

public class Staff extends Employee {
	private String title;

	public Staff(String name, String adress, String phoneNumber, String emailAdress, String office, double salary,
			String title) {
		super(name, adress, phoneNumber, emailAdress, office, salary);
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTitle: " + getTitle();
	}

}
