package chapter10;

import java.math.BigInteger;

public class Exercise10_18 {
	public static void main(String[] args) {
		BigInteger b = new BigInteger(Long.MAX_VALUE + "");
		int primeCount = 5;
		b = b.add(BigInteger.ONE);
		while (0 < primeCount) {
			boolean isPrime = true;
			int compare = 1;
			BigInteger i = new BigInteger(2 + "");
			while (compare > 0) {
				if (b.remainder(new BigInteger(i + "")).equals(BigInteger.ZERO)) {
					b = b.add(BigInteger.ONE);
					isPrime = false;
					break;
				}
				i = i.add(BigInteger.ONE);
				compare = b.compareTo(i);
			}
			if (isPrime) {
				System.out.println(b);
				b = b.add(BigInteger.ONE);
				primeCount--;
			}
		}
	}
}
