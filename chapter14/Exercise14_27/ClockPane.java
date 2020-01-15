package chapter14.Exercise14_27;

import java.util.GregorianCalendar;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;
	private double w = 300;
	private double h = 300;

	public ClockPane() {
		setCurrentTime();
	}

	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}

	private void setCurrentTime() {
		java.util.Calendar calender = new java.util.GregorianCalendar();

		this.hour = calender.get(GregorianCalendar.HOUR);
		this.minute = calender.get(GregorianCalendar.MINUTE);
		this.second = calender.get(GregorianCalendar.SECOND);
		paintClock();
	}

	public void paintClock() {
		setPadding(new Insets(20, 10, 10, 20));
		double centerX = w / 2;
		double centerY = h / 2;
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;

		double hourHandLength = clockRadius * 0.5;
		double minuteHandLength = clockRadius * 0.65;
		double secondHandLength = clockRadius * 0.8;

		double secondEndX = centerX + secondHandLength * Math.sin(second * (2 * Math.PI / 60));
		double secondEndY = centerX - secondHandLength * Math.cos(second * (2 * Math.PI / 60));
		double minuteEndX = centerX + minuteHandLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteEndY = centerX - minuteHandLength * Math.cos(minute * (2 * Math.PI / 60));
		double hourEndX = centerX + hourHandLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourEndY = centerY - hourHandLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));

		Circle clock = new Circle(centerX, centerY, clockRadius);
		clock.setStroke(Color.BLACK);
		clock.setFill(Color.color(0, 0, 1, 0.1));

		Line secondLine = new Line(centerX, centerY, secondEndX, secondEndY);
		secondLine.setStrokeWidth(3);
		secondLine.setStroke(Color.RED);

		Line minuteLine = new Line(centerX, centerY, minuteEndX, minuteEndY);
		minuteLine.setStrokeWidth(3);
		minuteLine.setStroke(Color.GREEN);

		Line hourLine = new Line(centerX, centerY, hourEndX, hourEndY);
		hourLine.setStrokeWidth(3);
		hourLine.setStroke(Color.BLUE);

		Text textClockTime = new Text(getW() * 0.45, getH(),
				(getHour() / 10 == 0 ? "0" + getHour() : getHour()) + ":"
						+ (getMinute() / 10 == 0 ? "0" + getMinute() : getMinute()) + ":"
						+ (getSecond() / 10 == 0 ? "0" + getSecond() : getSecond()));

		getChildren().clear();

		for (int i = 0; i < 60; i++) {
			if (i % 5 == 0)
				continue;
			double startX = centerX + clockRadius * Math.cos(2 * i * (Math.PI / 60));
			double startY = centerY + clockRadius * Math.sin(2 * i * (Math.PI / 60));
			double endX = startX - (clockRadius / 30) * Math.cos(2 * i * (Math.PI / 60));
			double endY = startY - (clockRadius / 30) * Math.sin(2 * i * (Math.PI / 60));
			Line line = new Line(startX, startY, endX, endY);
			getChildren().add(line);
		}

		int hour = 3;
		for (int i = 0; i < 12; i++) {
			double startX = centerX + clockRadius * Math.cos(2 * i * Math.PI / 12);
			double startY = centerY + clockRadius * Math.sin(2 * i * Math.PI / 12);
			double endX = startX - (clockRadius / 12) * Math.cos(2 * i * Math.PI / 12);
			double endY = startY - (clockRadius / 12) * Math.sin(2 * i * Math.PI / 12);

			Line line = new Line(startX, startY, endX, endY);

			double textX = (centerX + (clockRadius / 1.25) * Math.cos(2 * i * Math.PI / 12)) - 4;
			double textY = (centerY + (clockRadius / 1.25) * Math.sin(2 * i * Math.PI / 12)) + 4;

			Text text = new Text(textX, textY, "" + hour++);

			getChildren().addAll(text, line);
			hour = hour == 13 ? 1 : hour;
		}

		getChildren().addAll(clock, secondLine, minuteLine, hourLine, textClockTime);

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
		paintClock();
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
		paintClock();
	}

}
