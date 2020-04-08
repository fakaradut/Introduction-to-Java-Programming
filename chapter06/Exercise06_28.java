package chapter06;

public class Exercise06_28 {

	public static void main(String[] args) {
		
		System.out.printf("%-4s%-4s\n","p","2^p-1");
		System.out.println("---------------");
		for (int i = 0; i <= 31; i++) {
			if (isMersennePrime(i)) {
				System.out.printf("%-4d%-4d\n",i,(int)(Math.pow(2, i)-1));
				
			}
		}
		

	}

	public static boolean isMersennePrime(int number) {
		if (isPrime(number) && isPrime((int)(Math.pow(2, number)-1))) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int number) {
		if (number < 2)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
