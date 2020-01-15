package chapter14.Exercise14_28;

import java.util.GregorianCalendar;

import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;
	private double w = 300;
	private double h = 300;
	private boolean secondHandVisible = true;
	private boolean minuteHandVisible = true;
	private boolean hourHandVisible = true;

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

		Text t1 = new Text(centerX - 10, centerY - clockRadius + 18, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

		t1.setFont(Font.font(Math.min(w, h) * 0.05));
		t2.setFont(Font.font(Math.min(w, h) * 0.05));
		t3.setFont(Font.font(Math.min(w, h) * 0.05));
		t4.setFont(Font.font(Math.min(w, h) * 0.05));

		Line secondLine = new Line(centerX, centerY, secondEndX, secondEndY);
		secondLine.setStrokeWidth(3);
		secondLine.setStroke(Color.RED);

		Line minuteLine = new Line(centerX, centerY, minuteEndX, minuteEndY);
		minuteLine.setStrokeWidth(3);
		minuteLine.setStroke(Color.GREEN);

		Line hourLine = new Line(centerX, centerY, hourEndX, hourEndY);
		hourLine.setStrokeWidth(3);
		hourLine.setStroke(Color.BLUE);

		getChildren().clear();
		getChildren().addAll(clock, t1, t2, t3, t4);

		if (getSecondHandVisible()) {
			getChildren().add(secondLine);
		}
		if (getMinuteHandVisible()) {
			getChildren().add(minuteLine);
		}
		if (getHourHandVisible()) {
			getChildren().add(hourLine);
		}
	}

	public boolean getSecondHandVisible() {
		return secondHandVisible;
	}

	public void setSecondHandVisible(boolean isVisible) {
		this.secondHandVisible = isVisible;
		paintClock();
	}

	public boolean getMinuteHandVisible() {
		return minuteHandVisible;
	}

	public void setMinuteHandVisible(boolean isVisible) {
		this.minuteHandVisible = isVisible;
		paintClock();
	}

	public boolean getHourHandVisible() {
		return hourHandVisible;
	}

	public void setHourHandVisible(boolean isVisible) {
		this.hourHandVisible = isVisible;
		paintClock();
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
