package chapter12.Exercise12_10;

public class Exercise12_10 {
	public static void main(String[] args) {

		try {
			double[] outOfMemory = new double[1_000_000_000];
		} catch (OutOfMemoryError e) {
			System.out.println("The error is caught");
			System.out.println(e);
		}
		System.out.println("The end");
	}
}
