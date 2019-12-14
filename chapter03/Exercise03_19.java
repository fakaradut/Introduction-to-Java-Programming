package chapter03;

import java.util.Scanner;

public class Exercise03_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the triangle's edges: ");
		int edge1 = input.nextInt();
		int edge2 = input.nextInt();
		int edge3 = input.nextInt();

		if (edge1 + edge2 < edge3 || edge1 + edge3 < edge2 || edge3 + edge2 < edge1) {
			System.out.println("Invalid input.");
		} else {
			System.out.println("Perimeter of triangle is: " + (edge1 + edge2 + edge3));
		}
	}
}
