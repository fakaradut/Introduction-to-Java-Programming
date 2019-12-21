package chapter09.Exercise09_07;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 20_000);
		account.deposit(3_000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2_500);

		System.out.println("Account id: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Monthly interest: " + account.getMonthlyInterest());

	}
}
