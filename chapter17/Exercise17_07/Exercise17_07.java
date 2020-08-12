package chapter17.Exercise17_07;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exercise17_07 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		double loanAmount = 0;
		try (ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("Exercise17_07.dat")))) {

			while (true) {
				loanAmount += ((Loan) ois.readObject()).getLoanAmount();
			}
		} catch (EOFException e) {
			System.out.println("Total loan amount: " + loanAmount);
		}
	}

}
