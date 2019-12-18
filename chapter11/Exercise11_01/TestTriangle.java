package chapter11.Exercise11_01;

public class TestTriangle {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.print("Color and is filled ");
		String color = input.next();
		boolean filled = input.nextBoolean();

		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);

		System.out.println(t.toString() + "\nArea: " + t.getArea() + "\nPerimeter: " + t.getPerimeter() + "\nColor: "
				+ t.getColor() + "\nTriangle is" + (t.isFilled() ? "" : " not ") + " filled");

	}
}
