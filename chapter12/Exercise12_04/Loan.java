package chapter12.Exercise12_04;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	public Loan() {
		this(2.5, 1, 1000);
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if (annualInterestRate <= 0) {
			throw new IllegalArgumentException("Annual interest rate must be positive");
		}
		if (numberOfYears <= 0) {
			throw new IllegalArgumentException("Number of years must be positive");
		}
		if (loanAmount <= 0) {
			throw new IllegalArgumentException("Loan amount must be positive");
		}
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate <= 0) {
			throw new IllegalArgumentException("Annual interest rate must be positive");
		}
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears <= 0) {
			throw new IllegalArgumentException("Number of years must be positive");
		}
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0) {
			throw new IllegalArgumentException("Loan amount must be positive");
		}
		this.loanAmount = loanAmount;
	}

	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
		return monthlyPayment;
	}

	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}

	@Override
	public String toString() {
		return "Annual interest rate: " + getAnnualInterestRate() + "\nNumber of years: " + getNumberOfYears()
				+ "\nLoan Amount: " + getLoanAmount() + "\nCreated date: " + getLoanDate();
	}
}
