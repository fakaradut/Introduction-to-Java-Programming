package chapter10.Exercise10_01;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		second = (int) ((System.currentTimeMillis() / 1_000) % 60);
		minute = (int) (((System.currentTimeMillis() / 1_000) / 60) % 60);
		hour = (int) ((System.currentTimeMillis() / (60_000 * 60)) % 24);
	}

	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(long elapsedTime) {
		second = (int) ((elapsedTime / 1_000) % 60);
		minute = (int) (((elapsedTime / 1_000) / 60) % 60);
		hour = (int) ((elapsedTime / (60_000 * 60)) % 24);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

}
