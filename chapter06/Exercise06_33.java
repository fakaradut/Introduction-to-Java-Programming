package chapter06;

public class Exercise06_33 {
	public static void main(String[] args) {
		long second = System.currentTimeMillis() / 1000;
		long minute = (second / 60);
		long hour = (minute / 60);
		long day = (hour / 24);

		System.out.println("Current date and the time is:\n" +"Date: "+ monthAndDay(day) + " " + dayInTheWeek(day) + " ," + year(day));
		
		System.out.println("Time: " +(hour % 24) + ":" + minute % 60 + ":" + second % 60+" GMT");
	}
	
	public static String monthAndDay(long day) {
		int year = 1970;
		long i;
		
		for(i=day;(365+(isLeap(year)?(1):(0)))<i ;i-=365){
			if(isLeap(year)) {
				i--;
			}
			year++;
		}
		day=i;
		day++;
		
		
	    if (day <= 31) {
			return "Jan "+day;
		} 
		else if (day - 31 <= (isLeap(year) ? 29 : 28)) {
			return "Feb "+(day- 31);
		} 
		else if (day - (isLeap(year) ? 60 : 59) <= 31) {
			return "Mar "+(day- (isLeap(year) ? 60 : 59));
		} 
		else if (day - (isLeap(year) ? 91 : 90) <= 30) {
			return "Apr "+(day- (isLeap(year) ? 91 : 90));
		} 
		else if (day - (isLeap(year) ? 121 : 120) <= 31) {
			return "May "+(day- (isLeap(year) ? 121 : 120));
		}
		else if (day - (isLeap(year) ? 152 : 151) <= 30) {
			return "Jun "+(day- (isLeap(year) ? 152 : 151));
		}
		else if (day - (isLeap(year) ? 182 : 181) <= 31) {
			return "July "+(day- (isLeap(year) ? 182 : 181));
		}
		else if (day - (isLeap(year) ? 213 : 212) <= 31) {
			return "August "+(day- (isLeap(year) ? 213 : 212));
		}
		else if (day - (isLeap(year) ? 244 : 243) <= 30) {
			return "Sept "+(day- (isLeap(year) ? 244 : 243));
		} 
		else if (day - (isLeap(year) ? 274 : 273) <= 31) {
			return "Oct "+(day- (isLeap(year) ? 274 : 273));
		} 
		else if (day - (isLeap(year) ? 305 : 304) <= 30) {
			return "Now "+(day- (isLeap(year) ? 305 : 304));
		}
		else {
			return "Dec "+(day- (isLeap(year) ? 335 : 334));
		}

	
		
	}
	
 	public static int year(long day) {
		int year=1970;
		
		for(long i=day;365+(isLeap(year)?(1):(0))<i;i-=365) {
			if(isLeap(year)) {
				i--;
			}
			year++;
		}
		return year;
}
	
	public static String dayInTheWeek(long day) {
		day=day%7;
		int days=(int)day;
		switch (days) {
		case 0:return "Thr";
		case 1:return "Fri";
		case 2:return "Sat";
		case 3:return "Sun";
		case 4:return "Mon";
		case 5:return "Thu";
		default:return "Wed";		}
		}
	

 	public static boolean isLeap(long year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 4_000 != 0;
	}
}
