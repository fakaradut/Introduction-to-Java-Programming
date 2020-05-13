package chapter10.Exercise10_07;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {
		dateCreated = new Date();
	}

	Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;

	}

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12.;
	}

	double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100.);
	}

	String getDateCreated() {
		return dateCreated.toString();
	}

	int getId() {
		return id;
	}

	double getBalance() {
		return balance;
	}

	double annualInterestRate() {
		return annualInterestRate;
	}

	void setId(int id) {
		this.id = id;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
}
