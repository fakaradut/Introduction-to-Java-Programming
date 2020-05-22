package chapter10.Exercise10_14;

public class TestMyDate {
	public static void main(String[] args) {
		MyDate dt1 = new MyDate();
		MyDate dt2 = new MyDate((34355555133101L));
		System.out.println(dt1.getDay() + "." + dt1.getMonth() + "." + dt1.getYear());
		System.out.println(dt2.getDay() + "." + dt2.getMonth() + "." + dt2.getYear());
	}
}
