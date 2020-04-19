package chapter06;

public class Exercise06_37 {
	public static void main(String[] args) {
		
		System.out.println(format(11112, 10));
	}

	public static String format( int number, int width) {
		String str="";
		int count=0;
		str=""+number+"";
		while(number!=0) {
			count++;
			number/=10;
		}
		
		
		if(width<=count) {
			return str;
		}else {
			for(int i=1;i<=(width-count);i++) {
				str="0"+str;
				
			}return str;
		}
		
	}
}
