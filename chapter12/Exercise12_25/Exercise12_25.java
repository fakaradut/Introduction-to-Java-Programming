package chapter12.Exercise12_25;

import java.io.File;
import java.util.Scanner;

public class Exercise12_25 {
	public static void main(String[] args) throws Exception {
		File file = new File("Salary.txt");

		double assistantSalary = 0;
		double assosiateSalary = 0;
		double fullSalary = 0;

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String s = input.next();
				if (s.equals("assistant")) {
					assistantSalary += Float.valueOf(input.next());
				} else if (s.equals("associate")) {
					assosiateSalary += Float.valueOf(input.next());
				} else if (s.equals("full")) {
					fullSalary += Float.valueOf(input.next());
				}
			}
		}
		double sum = assistantSalary + assosiateSalary + fullSalary;
		System.out.println("Assistant professors: " + assistantSalary);
		System.out.println("Associate professors: " + assosiateSalary);
		System.out.println("Full professors:      " + fullSalary);
		System.out.println("All faculty:          " + sum);
	}
}
