package chapter11.Exercise11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions = new ArrayList<>();

	public Account() {
		dateCreated = new Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, ""));
	}

	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, ""));
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100.);
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

}
