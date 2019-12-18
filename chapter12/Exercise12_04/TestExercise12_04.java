package chapter12.Exercise12_04;

public class TestExercise12_04 {
	public static void main(String[] args) {
		Loan loan = new Loan();
		try {
			new Loan(1, 0, 0);
			loan.setLoanAmount(0);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		System.out.println("The end");
	}
}
