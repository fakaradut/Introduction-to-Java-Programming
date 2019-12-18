package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five number: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
		System.out.println("Sum of the numbers: " + sum(list));
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
