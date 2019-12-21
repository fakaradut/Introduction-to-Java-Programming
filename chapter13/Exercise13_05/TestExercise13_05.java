package chapter13.Exercise13_05;

public class TestExercise13_05 {
	
	public static void main(String[] args) {

		Circle c1 = new Circle(15);
		Circle c2 = new Circle(5);

		Triangle t1 = new Triangle(5, 8, 6);
		Triangle t2 = new Triangle(1, 2, 3);

		Rectangle r1 = new Rectangle(20, 10);
		Rectangle r2 = new Rectangle(40, 25);

		Circle maxCircle = (Circle) GeometricObject.max(c1, c2);
		Triangle maxTriangle = (Triangle) GeometricObject.max(t1, t2);
		Rectangle maxRectangle = (Rectangle) GeometricObject.max(r1, r2);

		System.out.println("Circle 1 compare to cirle 2 : " + c1.compareTo(c2));
		System.out.println("Triangle 1 compare to Triangle 2 : " + t1.compareTo(t2));
		System.out.println("rectangle 1 compare to rectangle 2 : " + r1.compareTo(r2));
		
		System.out.println("\n-----------------------------------------");
		
		System.out.println("Max circle is \n" + maxCircle.toString());
		System.out.println("\nMax triangle is \n" + maxTriangle.toString());
		System.out.println("\nMax rectangle is \n" + maxRectangle.toString());

	}
	
}
