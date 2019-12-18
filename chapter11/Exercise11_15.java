package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of the points: ");

		int size = input.nextInt();
		ArrayList<ArrayList<Double>> list = new ArrayList<>();
		System.out.println("Enter the coordinates of the points clockwise: ");

		for (int i = 0; i < size; i++) {
			ArrayList<Double> point = new ArrayList<>();
			point.add(input.nextDouble());
			point.add(input.nextDouble());
			list.add(point);
		}

		System.out.println("The total area is: " + getAreaConvexPolygon(list));

	}

	public static double getAreaConvexPolygon(ArrayList<ArrayList<Double>> list) {
		double sum = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			double x0 = list.get(i).get(0);
			double y0 = list.get(i).get(1);
			double x1 = list.get(i + 1).get(0);
			double y1 = list.get(i + 1).get(1);
			sum += ((x0 * y1) - (y0 * x1));
			if (i == list.size() - 2) {
				x0 = list.get(list.size() - 2).get(0);
				y0 = list.get(list.size() - 2).get(1);
				x1 = list.get(0).get(0);
				y1 = list.get(0).get(1);
				sum += ((x0 * y1) - (y0 * x1));
			}
		}
		return (sum / 2) >= 0 ? (sum / 2) : -(sum / 2);
	}
}
