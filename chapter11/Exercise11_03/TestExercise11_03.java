package chapter11.Exercise11_03;

public class TestExercise11_03 {
	public static void main(String[] args) {

		Account a = new Account(1, 1_000);
		SavingAccount sa = new SavingAccount(2, 2_000);
		CheckingAccount ca = new CheckingAccount(3, 3_000, 300);

		a.setAnnualInterestRate(1);
		sa.setAnnualInterestRate(2);
		ca.setAnnualInterestRate(3);

		a.withdraw(100);
		sa.withdraw(200);
		ca.withdraw(300);

		a.deposit(1_000);
		sa.deposit(2_000);
		ca.deposit(3_000);

		System.out.println(a.toString() + "\n\n" + sa.toString() + "\n\n" + ca.toString());
	}
}
