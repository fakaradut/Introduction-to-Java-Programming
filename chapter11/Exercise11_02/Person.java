package chapter11.Exercise11_02;

public class Person {
	private String name;
	private String adress;
	private String phoneNumber;
	private String emailAdress;

	public Person(String name, String adress, String phoneNumber, String emailAdress) {
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " class\nName: " + getName() + "\nAdress: " + getAdress()
				+ "\nPhone number: " + getPhoneNumber() + "\nEmail adress: " + getEmailAdress();
	}
}
