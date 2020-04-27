package chapter08;

public class Exercise08_04 {
	public static void main(String[] args) {
		int[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		
		printWorkHoursOfWorkers(workHours);
	}

	public static void printWorkHoursOfWorkers(int[][] list) {

		int[] time = new int[list.length];
		String workers[] = new String[list.length];

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				time[i] += list[i][j];
			}
			workers[i] = i + "";
		}

		for (int i = 0; i < workers.length - 1; i++) {
			int min = time[i];
		
			for (int j = i + 1; j < workers.length; j++) {
				if (time[j] < min) {
					time[i] = time[j];
					time[j] = min;
					String temp = workers[i];
					workers[i] = workers[j];
					workers[j] = temp;
					min = time[i];
				}
			}
		}
		for (int i = workers.length - 1; 0 <= i; i--) {
			System.out.println("Employee " + (Integer.parseInt(workers[i]) + 1) + "'s work hour is: " + time[i]);
		}

	}

}
