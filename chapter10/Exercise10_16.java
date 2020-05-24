package chapter10;

import java.math.*;

public class Exercise10_16 {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("10000000000000000000000000000000000000000000000000");
		int count = 0;
		do {
			b.add(new BigInteger("1"));
			if ((b.divide(new BigInteger("2")).equals(BigInteger.ZERO))
					|| (b.remainder(new BigInteger("2"))).equals(BigInteger.ZERO)) {
				count++;
				System.out.println(b);
			}
			b = b.add(BigInteger.ONE);
		} while (count < 10);
	}
}
