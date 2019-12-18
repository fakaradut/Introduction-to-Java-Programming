package chapter11.Exercise11_02;

public class Student extends Person {
	private String status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;

	public Student(String name, String adress, String phoneNumber, String emailAdress, int status) {
		super(name, adress, phoneNumber, emailAdress);
		this.status = setStatus(status);
	}

	public String getStatus() {
		return status;
	}

	public String setStatus(int status) {
		switch (status) {
		case FRESHMAN:
			return "Freshman";
		case SOPHOMORE:
			return "Sophomore";
		case JUNIOR:
			return "Junior";
		case SENIOR:
			return "Senior";
		default:
			return "Invalid status";
		}
	}

	@Override
	public String toString() {
		return super.toString()+"\nStatus: "+getStatus();
	}

}
