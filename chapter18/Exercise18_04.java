
public class Exercise18_04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("m("+i+") = "+m(i));
		}
	}

	public static double m(double i) {
		if (i <= 1) {
			return 1;
		} else {
			return (1. / i) + m(i - 1);
		}
	}

}
