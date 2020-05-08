package chapter10.Exercise10_02;

public class TestBMI {
	public static void main(String[] args) {
		BMI person1 = new BMI("Person 1:", 42, 120, 6, 8);
		System.out.println("The BMI for " + person1.getName() + " is " + person1.getBMI() + " " + person1.getStatus());

		BMI person2 = new BMI("Person 2:", 172, 7, 9);
		System.out.println("The BMI for " + person2.getName() + " is " + person2.getBMI() + " " + person2.getStatus());

	}
}
