package chapter04;

import java.util.Scanner;

public class Exercise04_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Employee’s name (e.g., Smith)");
		String name = input.next();
		System.out.println("Number of hours worked in a week (e.g., 10)");
		int workHours = input.nextInt();
		System.out.println("Hourly pay rate (e.g., 9.75)");
		double payRate = input.nextDouble();
		System.out.println("Federal tax withholding rate (e.g., 20%)");
		double federalTaxRate = input.nextDouble();
		System.out.println("State tax withholding rate (e.g., 9%)");
		double stateTaxRate = input.nextDouble();

		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + workHours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + (workHours * payRate));
		System.out.println("Deductions: ");
		System.out.println("  Federal Witholding (20.0%): $" + (federalTaxRate * workHours * payRate));
		System.out.println("  State Withholding (9.0%): $" + (stateTaxRate * workHours * payRate));
		System.out.println(
				"  Total Deduction: $" + ((federalTaxRate * workHours * payRate) + (stateTaxRate * workHours * payRate)));
		System.out.println("Net Pay: $" + ((workHours * payRate)
				- ((federalTaxRate * workHours * payRate) + (stateTaxRate * workHours * payRate))));

	}
}
