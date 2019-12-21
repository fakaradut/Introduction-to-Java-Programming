package chapter09.Exercise09_09;

public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon rg1 = new RegularPolygon();
		RegularPolygon rg2 = new RegularPolygon(6, 4);
		RegularPolygon rg3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Regular polygon 1\nArea: " + rg1.getArea() + " Perimeter: " + rg1.getPerimeter());
		System.out.println("\nRegular polygon 2\nArea: " + rg2.getArea() + " Perimeter: " + rg2.getPerimeter());
		System.out.println("\nRegular polygon 3\nArea: " + rg3.getArea() + " Perimeter: " + rg3.getPerimeter());
	}
}
