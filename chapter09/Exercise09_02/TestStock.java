package chapter09.Exercise09_02;

public class TestStock {
	public static void main(String[] args) {
		Stock product = new Stock("ORCL", "Oracle Corporation");
		product.currentPrice = 34.35;
		product.previousClosingPrice = 34.5;
		System.out.println(product.getChangePercent());
	}
}
