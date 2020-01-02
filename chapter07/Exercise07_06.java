package chapter07;

public class Exercise07_06 {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIME_NUMBERS = 50;
		int[] primeNumbersArray = new int[NUMBER_OF_PRIME_NUMBERS];
		int primeNumberCount = 0;
		int start = 2;

		while (primeNumberCount < NUMBER_OF_PRIME_NUMBERS) {
			if (isPrime(start)) {
				primeNumbersArray[primeNumberCount] = start;
				primeNumberCount++;
			}
			start++;
		}
		
		for (int i = 1; i <= primeNumbersArray.length; i++) {
			if(i%10==0) {
				System.out.print(primeNumbersArray[i-1]+"\n");
			}else {
				System.out.print(primeNumbersArray[i-1]+"\t");
			}
		}
	}

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		int divide = 2;

		while (divide <= Math.sqrt(number)) {
			isPrime = true;
			if (number % divide == 0) {
				return false;
			}
			divide++;
		}
		return isPrime;
	}

}
