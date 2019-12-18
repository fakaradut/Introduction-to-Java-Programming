package chapter11.Exercise11_02;

public class Faculty extends Employee {
	private int officeHours;
	private String rank;

	public Faculty(String name, String adress, String phoneNumber, String emailAdress, String office, double salary,
			int officeHours, String rank) {
		super(name, adress, phoneNumber, emailAdress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOffice hours: " + getOfficeHours() + "\nRank: " + getRank();
	}
}
