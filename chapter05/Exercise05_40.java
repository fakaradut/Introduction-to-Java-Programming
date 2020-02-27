package chapter05;

public class Exercise05_40 {

	public static void main(String[] args) {

		int tail = 0;
		int head = 0;
		for (int i = 0; i < 1_000_000; i++) {
			switch ((int) (Math.random() * 2)) {
			case 0:
				tail++;
				break;
			default:
				head++;
				break;
			}

		}
		System.out.println("Number of tails: " + tail + "\nNumber of heads: " + head);
	}

}
