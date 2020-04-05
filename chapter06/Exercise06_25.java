package chapter06;

public class Exercise06_25 {
	public static void main(String[] args) {
		System.out.println(convertMillis(555550000));
	}
	
	public static String convertMillis(long millis) {
		String str="";
		long second=millis/1_000;
		int currentSecond=(int)(second%60);
		int minute=(int)(second/60);
		int currentMinute=minute%60;
		int hour=minute/60;
		str=hour+":"+currentMinute+":"+currentSecond;
		
		return str;
	}
	
}