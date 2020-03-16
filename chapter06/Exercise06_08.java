package chapter06;

public class Exercise06_08 {

	public static void main(String[] args) {
		System.out.printf("%-15s%-15s%3s%7s%-15s%-15s", "Santrigrat", "Fahrenheit", "|", "", "Fahrenheit",
				"Santrigrat");
		System.out.println("\n-----------------------------------------------------------------");
		for (int i = 1; i <= 10; i++) {

			System.out.printf("\n%-15.2f%-15.2f%3s%7s%-15.2f%-15.2f", 39. + i, celciusToFahrenheit(39. + i), "|", "",
					130. - (i * 10), fahrenheitToCelcius(130. - (i * 10)));

		}

	}

	public static double fahrenheitToCelcius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

	public static double celciusToFahrenheit(double celcius) {
		return (9.0 / 5) * celcius + 32;
	}

}
