package chapter13.Exercise13_16;

public class Exercise13_16 {
	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		int result = 0;
		String[] splitFirst = args[0].split("/");
		int firstNumerator = Integer.parseInt(splitFirst[0]);
		int firstDenominator = Integer.parseInt(splitFirst[1]);

		String[] splitSecond = args[2].split("/");
		int secondNumerator = Integer.parseInt(splitSecond[0]);
		int secondDenominator = Integer.parseInt(splitSecond[1]);

		if (args[1].equals("/")) {
			int temp = secondDenominator;
			secondDenominator = secondNumerator;
			secondNumerator = temp;
			args[1] = ".";
		}
		int totalDenominator = 0;

		switch (args[1].charAt(0)) {
		case '+':
			result = (firstNumerator + secondNumerator);
			break;
		case '-':
			result = (firstNumerator - secondNumerator);
			break;
		case '.':
			result = (firstNumerator * secondNumerator);
			break;

		}

		if (args[1].equals("-") || args[1].equals("+")) {
			totalDenominator = getNearestBiggerNumber(firstDenominator, secondDenominator);
			firstNumerator *= totalDenominator / firstDenominator;
			secondNumerator *= totalDenominator / secondDenominator;
		} else {
			totalDenominator = firstDenominator * secondDenominator;
			int divideNumber = getNearestSmallerNumber(totalDenominator, result);
			result /= divideNumber;
			totalDenominator /= divideNumber;
		}

		System.out.println(splitFirst[0] + '/' + splitFirst[1] + " " + args[1] + " " + splitSecond[0] + '/'
				+ splitSecond[1] + " = " + result + "/" + totalDenominator);

	}

	public static int getNearestBiggerNumber(int num1, int num2) {
		int bigNum = num1 > num2 ? num1 : num2;

		while (true) {
			if (bigNum % num1 == 0 && bigNum % num2 == 0) {
				break;
			}
			bigNum++;
		}
		return bigNum;
	}

	public static int getNearestSmallerNumber(int num1, int num2) {
		int smallNum = num1 > num2 ? num2 : num1;

		while (true) {
			if (num1 % smallNum == 0 && num2 % smallNum == 0) {
				break;
			}
			smallNum--;
		}
		return smallNum;
	}
}
