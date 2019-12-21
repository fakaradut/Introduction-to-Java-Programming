package chapter09.Exercise09_06;

public class StopWatch {
	private double startTime;
	private double endTime;

	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	double start() {
		return this.startTime = System.currentTimeMillis();
	}

	double stop() {
		return this.endTime = System.currentTimeMillis();
	}

	double getElapsedTime() {
		return endTime - startTime;
	}

	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}

	public double getStartTime() {
		return startTime;
	}

	public double getEndTime() {
		return endTime;
	}
}
