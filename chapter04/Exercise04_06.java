package chapter04;

public class Exercise04_06 {

	public static void main(String args[]) {
		double radius = 40;

		double a1 = Math.random() * (Math.PI * 2);
		double a2 = Math.random() * (Math.PI * 2);
		double a3 = Math.random() * (Math.PI * 2);

		double x1 = radius * Math.cos(a1);
		double y1 = radius * Math.sin(a1);
		double x2 = radius * Math.cos(a2);
		double y2 = radius * Math.sin(a2);
		double x3 = radius * Math.cos(a3);
		double y3 = radius * Math.sin(a3);

		System.out.println("Random points are: ");
		System.out.println(x1 + ", " + y1);
		System.out.println(x2 + ", " + y2);
		System.out.println(x3 + ", " + y3);

	}

}
