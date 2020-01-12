package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_22 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int WINDOW_SIZE = 200;

		Pane pane = new Pane();
		double x1 = WINDOW_SIZE * Math.random();
		double y1 = WINDOW_SIZE * Math.random();
		double x2 = WINDOW_SIZE * Math.random();
		double y2 = WINDOW_SIZE * Math.random();

		while (true) {
			// for circles not overlap
			if (distance(x1, y1, x2, y2) > 30)
				break;
			else {
				x1 = WINDOW_SIZE * Math.random();
				y1 = WINDOW_SIZE * Math.random();
				x2 = WINDOW_SIZE * Math.random();
				y2 = WINDOW_SIZE * Math.random();
			}
		}

		Circle c1 = new Circle(x1, y1, 15, Color.WHITE);
		Circle c2 = new Circle(x2, y2, 15, Color.WHITE);
		c1.setStroke(Color.BLACK);
		c2.setStroke(Color.BLACK);
		Text txt1 = new Text(x1, y1, "1");
		Text txt2 = new Text(x2, y2, "2");

		Line line = new Line(x1, y1, x2, y2);

		pane.getChildren().addAll(line, c1, c2, txt1, txt2);

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);
		stackPane.setPadding(new Insets(20));

		primaryStage.setTitle("Exercise14_22");
		primaryStage.setScene(new Scene(stackPane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
