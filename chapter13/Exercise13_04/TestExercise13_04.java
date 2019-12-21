package chapter13.Exercise13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestExercise13_04 {

	public static void main(String[] args) {
		Calendar myCalendar = new MyCalendar();

		if (args.length == 2) {
			myCalendar.set(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);

		} else if (args.length == 1) {
			myCalendar.set(myCalendar.get(GregorianCalendar.YEAR), Integer.valueOf(args[0]) - 1, 1);
		} else {
			System.out.println("Usage: java Exercise13_04 month year or\n       java Exercise13_04 month");
			System.exit(1);
		}

		((MyCalendar) myCalendar).displayCalendar();
	}

}