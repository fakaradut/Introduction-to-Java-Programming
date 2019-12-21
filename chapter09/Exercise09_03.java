package chapter09;

import java.util.Date;

public class Exercise09_03 {
	public static void main(String[] args) {

		Date dt = new Date(10000);
		
		for (long i = 10_000; i <= 100_000_000_000L; i *= 10) {
			dt.setTime(i);
			System.out.println(dt.toString());
		}
	}
}
