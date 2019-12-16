package chapter04;

import java.util.Scanner;

public class Exercise04_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side:");
		double area = (6 * Math.pow(input.nextDouble(), 2)) / (4 * Math.tan(Math.PI / 6));
		System.out.println("Enter the side: " + (int)(area * 100) / 100.);
	}

}
