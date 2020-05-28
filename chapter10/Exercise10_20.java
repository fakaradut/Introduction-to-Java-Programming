package chapter10;

import java.math.*;

public class Exercise10_20 {
	public static void main(String[] args) {
		for (int i = 100; i <= 1000; i += 100) {
			BigDecimal e = new BigDecimal("1");
			BigDecimal item = new BigDecimal(1 + "");
			for (int j = 1; j < i; j++) {
				item = item.divide(new BigDecimal(j + ""), 25, BigDecimal.ROUND_UP);
				e = e.add(item);
			}
			System.out.printf("%-5s%-5d%-5s%-5s\n", "i: ", i, " e:", e);
		}
	}

}
