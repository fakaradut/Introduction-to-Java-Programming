package chapter03;

import java.util.Scanner;

public class Exercise03_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("(" + x2 + "," + y2 + ") ");
		double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		if (status <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1))) {
			System.out.print("is on the line segment");
		} else {
			System.out.print("is not on the line segment");
		}
		System.out.println(" from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
	}

}
