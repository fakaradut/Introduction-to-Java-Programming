package chapter14;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Exercise14_25 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		double radius = 200;

		Circle circle = new Circle(radius, radius, radius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);

		Polygon polygon = new Polygon();
		ObservableList<Double> list = polygon.getPoints();
		placePointToCircle(list, radius, 5);

		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);

		Pane pane = new Pane();
		pane.getChildren().addAll(circle, polygon);

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);
		stackPane.setPadding(new Insets(20));

		primaryStage.setTitle("Exercise14_25");
		primaryStage.setScene(new Scene(stackPane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void placePointToCircle(ObservableList<Double> list, double radius, int numberOfPoints) {
		ArrayList<Double> points = new ArrayList<>();
		double[] angles = new double[numberOfPoints];
		int index = 0;

		for (int i = 0; i < 5; i++) {
			double x = Math.random() * (Math.PI * 2);
			double y = Math.random() * (Math.PI * 2);
			boolean isAdded = false;

			// before adding points to polygon, if point's list already contain or not
			// angles array keeps their angles
			
			for (int j = 0; j < (points.size() - 1) && !isAdded; j += 2) {
				if (points.get(j) != 2 && points.get(j + 1) != y) {
					points.add(radius + radius * Math.cos(x));
					index++;
					points.add(radius + radius * Math.sin(x));
					index++;
					angles[i] = Math
							.toDegrees(Math.atan2(points.get(index - 1) - radius, points.get(index - 2) - radius));
					isAdded = true;
				} else
					i--;
			}

			if (i == 0 && points.size() == 0) {
				points.add(radius + radius * Math.cos(x));
				index++;
				points.add(radius + radius * Math.sin(x));
				index++;
				angles[i] = Math.toDegrees(Math.atan2(points.get(i + 1) - radius, points.get(i) - radius));
			}

		}

		// after adding points to list, i am sorting the points by their angles.

		while (true) {
			int j = biggestValueIndex(angles);
			if (j == -1)
				break;
			list.add(points.get(j * 2));
			list.add(points.get(j * 2 + 1));
		}

	}

	public int biggestValueIndex(double[] list) {
		int index = 0;
		double max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (max < list[i]) {
				index = i;
				max = list[i];
			}
		}
		list[index] = -3600;
		return max == -3600 ? -1 : index;
	}
}
