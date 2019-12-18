package chapter11.Exercise11_03;

public class CheckingAccount extends Account {
	private double overdraft;

	public CheckingAccount(int id, double balance, double overdraft) {
		super(id, balance);
		this.overdraft = overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > overdraft) {
			setBalance(getBalance() - amount);
		} else
			System.out.println("Amount is bigger than overdraft limit.");
	}

	public String toString() {
		return super.toString() + "\nOverdraft limit: " + overdraft;
	}

}
