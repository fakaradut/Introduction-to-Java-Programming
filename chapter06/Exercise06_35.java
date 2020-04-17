package chapter06;

public class Exercise06_35 {
	public static void main(String[] args) {
		System.out.println(area(5.5));
	}

	public static double area(double side) {

		return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

	}

}
