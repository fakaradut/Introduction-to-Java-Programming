package chapter06;

public class Exercise06_30 {
	public static void main(String[] args) {
		int dice = getDice();
		if (dice == 7 || dice == 11) {
			System.out.println("You win");
		} else if (dice == 2 || dice == 3 || dice == 12) {
			System.out.println("You lose");
		} else {
			System.out.println("Point is " + dice);
			int point =dice;
			
			for (;;) {
				dice=getDice();
				if (dice == 7) {
					System.out.println("You lose");
					System.exit(0);
				} else if (point == dice) {
					System.out.println("You win");System.exit(0);
				}
			}
		}

	}

	public static int getDice() {
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);

		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
		return dice1 + dice2;

	}

}
