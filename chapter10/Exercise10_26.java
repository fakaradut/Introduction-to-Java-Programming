package chapter10;

public class Exercise10_26 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		for (int i = 0; i < args.length; i++) {
			args[i] = args[i].replaceAll(" ", "");
		}

		int result = 0;
		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		}

		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}
