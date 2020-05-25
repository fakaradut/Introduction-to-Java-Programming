package chapter10;

import java.math.*;

public class Exercise10_17 {
	public static void main(String[] args) {
		long sqrt = (long) Math.sqrt(Long.MAX_VALUE);
		BigInteger big = new BigInteger(sqrt+"");
		for (int i = 0; i < 10; i++) {
			System.out.println(big.add(BigInteger.ONE).pow(2));
			big = big.add(BigInteger.ONE);
		}
		
	}
}
