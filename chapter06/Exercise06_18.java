package chapter06;

public class Exercise06_18 {
	public static void main(String[] args) {
		
		System.out.println(passwordValidation("aaaa7aa7"));
	}

	public static String passwordValidation(String password) {

		if (password.length() < 8) {
			return "Invalid password";
		}
		
		int digitCount = 0;
		for (int i = 0; i < password.length(); i++) {

			if (Character.isDigit(password.charAt(i))) {
				digitCount++;
			} else if (Character.isLetter(password.toLowerCase().charAt(i))) {

			} else {
				return "Invalid password";
			}

		}
		if (digitCount < 2) {
			return "Invalid password";
		}

		return "Valid password";
	}
}
