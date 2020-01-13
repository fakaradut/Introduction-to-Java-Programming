package chapter07;

public class Exercise07_14 {
	public static void main(String[] args) {

		System.out.println("The greatest divisor is: "+gcd(16,24,40));
	}

	public static int gcd(int... numbers) {
		int maxGcd = 1;
		int maxNum=0;
		
		for (int i = 0; i < numbers.length; i++) {
			maxNum=maxNum>=numbers[i]?maxNum:numbers[i];
		}
		
		for (int i = 2; i < maxNum/2; i++) {
			boolean isGcd = true;
			
			for (int j = 0; j < numbers.length; j++) {
				isGcd = numbers[j] % i == 0 ? true : false;
				if (!isGcd) {
					break;
				}
			}
			if (isGcd) {
				maxGcd = i;
			}

		}
		return maxGcd;
	}
}
