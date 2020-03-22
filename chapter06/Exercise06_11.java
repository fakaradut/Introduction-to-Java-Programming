package chapter06;

public class Exercise06_11 {
	public static void main(String[] args) {
		System.out.printf("%-16s%-10s\n","Sales Amount","Commission");
		System.out.println("------------------------");
		
		for(int i=10_000;i<=100_000;i+=5_000) {
			System.out.printf("%-16d%-7.1f\n",i,computeCommission(i));
		}
		
	}

	public static double computeCommission(double salesAmount) {

		double commission = 0;

		for (int i=1 ;i<=salesAmount ; i++) {

			if (i <= 5_000) {
				commission += (0.08);
			} else if (i <= 10_000) {
				commission += (0.1);
			} else {
				commission += (0.12);
			}
			
		}
		return commission;
	}
}
