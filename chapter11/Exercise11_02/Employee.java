package chapter11.Exercise11_02;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;

	public Employee(String name, String adress, String phoneNumber, String emailAdress, String office, double salary) {
		super(name, adress, phoneNumber, emailAdress);
		this.office = office;
		this.salary = salary;
		dateHired = new Date();
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nHired date: "
				+ getDateHired();
	}
}
