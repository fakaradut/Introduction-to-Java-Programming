package chapter06;

public class Exercise06_09 {

	public static void main(String[] args) {

		double feet = 1.;
		double meter = 20.;
		System.out.printf("%-8s%-8s%4s%4s%-8s%-8s", "Feet", "Metre", "|", "", "Metre", "Feet");
		System.out.println("\n---------------------------------------");
		for (int i = 0; i < 10; i++, meter += 5, feet++) {

			System.out.printf("%-8.1f%-8.3f%4s%4s%-8.1f%-8.3f\n", feet, footToMeter(feet), "|", "", meter,
					meterToFoot(meter));

		}

	}

	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

}
