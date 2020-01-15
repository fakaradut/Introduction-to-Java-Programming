package chapter14.Exercise14_29;

import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

public class BeanMachine extends Pane {
	static final double w = 200;
	static final double h = 150;
	static final double distance = (w / 0.8) / 8;

	public BeanMachine() {

		Polyline lines = new Polyline();
		ObservableList<Double> points = lines.getPoints();
		placePoints(points);

		placeBalls();

		getChildren().addAll(lines);

	}

	public void placeBalls() {
		getChildren().add(getCircle(w / 2, 2 * distance));

		double startX = w / 2 - distance / 2;

		for (int i = 1; i <= 2; i++) {
			getChildren().add(getCircle(startX + distance * (i - 1), 3 * distance));

		}

		startX = w / 2 - distance * (3 / 2.) + 15;
		for (int i = 1; i <= 3; i++) {
			getChildren().add(getCircle(startX + distance * (i - 1), 4 * distance));

		}

		startX = w / 2 - distance * (4 / 2.) + 15;
		for (int i = 1; i <= 4; i++) {
			getChildren().add(getCircle(startX + distance * (i - 1), 5 * distance));

		}

		startX = w / 2 - distance * (5 / 2.) + 15;
		for (int i = 1; i <= 5; i++) {
			getChildren().add(getCircle(startX + distance * (i - 1), 6 * distance));

		}

		startX = w / 2 - distance * (6 / 2.) + 15;
		for (int i = 1; i <= 6; i++) {
			getChildren().add(getCircle(startX + distance * (i - 1), 7 * distance));

		}

		startX = w / 2 - distance * (7 / 2.) + 15;
		for (int i = 1; i <= 7; i++) {
			Line line = new Line(startX + distance * (i - 1), 8 * distance, startX + distance * (i - 1),
					10 + distance * 10);
			line.setStrokeWidth(3);
			getChildren().add(line);
			getChildren().add(getCircle(startX + distance * (i - 1), 8 * distance));
		}

	}

	public void placePoints(ObservableList<Double> points) {
		points.add((w / 2) - (distance / 2));
		points.add(10.);
		points.add((w / 2) - (distance / 2));
		points.add(10 + distance);
		points.add((w / 2) - (8 * distance / 2));
		points.add(10 + distance * 8);
		points.add((w / 2) - (8 * distance / 2));
		points.add(10 + distance * 10);

		points.add((w / 2) + (8 * distance / 2));
		points.add(10 + distance * 10);
		points.add((w / 2) + (8 * distance / 2));
		points.add(10 + distance * 8);
		points.add((w / 2) + (distance / 2));
		points.add(10 + distance);
		points.add((w / 2) + (distance / 2));
		points.add(10.);

	}

	public Circle getCircle(double x, double y) {
		return new Circle(x, y, 6, Color.BLACK);
	}
}
