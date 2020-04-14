package chapter06;

public class Exercise06_32 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10_000; i++) {

			int dice = getDice();
			if (dice == 7 || dice == 11) {
				count++;
			} else if (dice == 2 || dice == 3 || dice == 12) {
			} else {

				int point = dice;

				for (;;) {
					dice = getDice();
					if (dice == 7) {

						break;
					} else if (point == dice) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println("Times of win: " + count);
	}

	public static int getDice() {
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);

		return dice1 + dice2;

	}
}
