package chapter10;

import java.math.BigInteger;

public class Exercise10_21 {
	public static void main(String[] args) {
		BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
		int count = 0;
		while (count < 10) {
			bigNum = bigNum.add(BigInteger.ONE);
			if (bigNum.remainder(new BigInteger(5 + "")).equals(BigInteger.ZERO)
					|| bigNum.remainder(new BigInteger(6 + "")).equals(BigInteger.ZERO)) {
				count++;
				System.out.println(bigNum);
			}
		}
	}
}
