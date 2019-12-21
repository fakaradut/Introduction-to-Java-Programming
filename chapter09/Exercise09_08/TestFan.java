package chapter09.Exercise09_08;

public class TestFan {
	public static void main(String[] args) {
		Fan fan1=new Fan();
		Fan fan2=new Fan();
		
		fan1.setSpeed(fan1.FAST);;
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.setOn(true);
		
		
		fan2.setSpeed(fan1.FAST);;
		fan2.setRadius(5);
		fan2.setColor("Blue");
		fan2.setOn(false);
		
		System.out.println(fan1.toString());
		System.out.println("\n"+fan2.toString());
	}
}
