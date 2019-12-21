package chapter09.Exercise09_02;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
