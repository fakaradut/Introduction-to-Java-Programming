package chapter11.Exercise11_08;

import java.util.Date;

public class Transaction {
	private Date date;
	// The type of the transaction, such as 'W' for withdrawal, 'D' for deposit.
	private char type;
	// The amount of the transaction.
	private double amount;
	// The new balance after this transaction.
	private double balance;
	// The description of this transaction.
	private String description;

	public Transaction(char type, double amount, double balance, String description) {
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getDescription() {
		return description;
	}
}
