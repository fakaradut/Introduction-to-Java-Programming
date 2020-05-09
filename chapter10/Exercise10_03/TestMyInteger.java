package chapter10.Exercise10_03;

public class TestMyInteger {
	public static void main(String[] args) {
		MyInteger m1 = new MyInteger(147);

		System.out.println("Integer " + m1.getValue() + " is" + (m1.isEven() ? " even" : " not even") + " is"
				+ (m1.isPrime() ? " prime" : " not prime") + " is" + (m1.isOdd() ? " odd" : " not odd"));
		System.out.println("---------------------------");
		int value = 37;

		System.out.println("Integer " + value + " is" + (MyInteger.isEven(value) ? " even" : " not even") + " is"
				+ (MyInteger.isPrime(value) ? " prime" : " not prime") + " is"
				+ (MyInteger.isOdd(value) ? " odd" : " not odd"));
		System.out.println("---------------------------");
		MyInteger m2 = new MyInteger(78);

		System.out.println("Integer " + m2.getValue() + " is" + (m2.isEven(m2) ? " even" : " not even") + " is"
				+ (m2.isPrime(m2) ? " prime" : " not prime") + " is" + (m2.isOdd(m2) ? " odd" : " not odd"));
		System.out.println("---------------------------");
		System.out.println("Integer " + m1.getValue() + " is " + (m1.equals(value) ? " equal" : " not equal")
				+ " with integer " + value);
		System.out.println("---------------------------");
		System.out.println("Integer " + m1.getValue() + " is " + (m1.equals(m2) ? " equal" : " not equal")
				+ " with integer " + m2.getValue());
		System.out.println("---------------------------");
		int number = MyInteger.parseInt(new char[] { '5', '4', '3', '2', '1' });
		System.out.println(number);

	}
}
