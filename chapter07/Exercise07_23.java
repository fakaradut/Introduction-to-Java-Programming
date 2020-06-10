package chapter07;

public class Exercise07_23 {
	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = false;
		}

		for (int number = 1; number <= 100; number++) {
			if (number == 1 || number == 2) {
				for (int i = number - 1; i < lockers.length; i++) {
					if (lockers[i] == false) {
						lockers[i] = true;
					} else {
						lockers[i] = false;
					}
				}
			} else {
				for (int i = number - 1; i < lockers.length; i++) {
					if (i % (number - 1) == 0 && lockers[i] == false) {
						lockers[i] = true;
					} else if (i % (number - 1) == 0 && lockers[i] == true) {
						lockers[i] = false;
					}
				}
			}

		}

		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == false) {
				System.out.println(i + 1 + ".locker is open");
			}
		}
	}
}
