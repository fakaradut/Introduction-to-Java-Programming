package chapter09.Exercise09_01;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(40, 4);
		Rectangle r2=new Rectangle(53.9, 3.5);
		
		//Display the width, height, area,and perimeter 
		System.out.println("Rectangle one's width: "+r1.width);
		System.out.println("Rectangle one's height: "+r1.height);
		System.out.println("Rectangle one's area: "+r1.getArea());
		System.out.println("Rectangle one's perimeter: "+r1.getPerimeter());
	
		System.out.println("\nRectangle two's width: "+r2.width);
		System.out.println("Rectangle two's height: "+r2.height);
		System.out.println("Rectangle two's area: "+r2.getArea());
		System.out.println("Rectangle two's perimeter: "+r2.getPerimeter());
	
	}
}
