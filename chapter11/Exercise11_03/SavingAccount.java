package chapter11.Exercise11_03;

public class SavingAccount extends Account {

	public SavingAccount(int id, double balace) {
		super(id, balace);
	}

	public void withdraw(double amount) {
		if (getBalance() - amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("There is not enough balance.");
		}
	}

}
