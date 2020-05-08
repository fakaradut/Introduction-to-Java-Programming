package chapter10.Exercise10_01;

public class TestTime {
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		printTime(t1);
		System.out.println("--------");
		printTime(t2);

	}

	public static void printTime(Time t) {
		System.out.print(t.getHour() + ":");
		System.out.print(t.getMinute() + ":");
		System.out.print(t.getSecond() + "\n");
	}
}
