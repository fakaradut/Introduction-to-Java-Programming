package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_10 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		double centerX = 100;
		double centerY = 40;
		double radiusX = 50;
		double radiusY = 20;

		Ellipse top = new Ellipse(centerX, centerY, radiusX, radiusY);
		top.setFill(Color.WHITE);
		top.setStroke(Color.BLACK);

		Arc bottomDash = new Arc(centerX, centerY + centerX, radiusX, radiusY, 0, 180);
		bottomDash.setFill(Color.WHITE);
		bottomDash.getStrokeDashArray().addAll(6.0, 21.0);
		bottomDash.setStroke(Color.BLACK);

		Arc bottom = new Arc(centerX, centerY + centerX, radiusX, radiusY, 180, 180);
		bottom.setFill(Color.WHITE);
		bottom.setStroke(Color.BLACK);

		Line lineLeft = new Line(centerX - radiusX, centerY, centerX - radiusX, centerX + centerY);
		Line lineRight = new Line(centerX + radiusX, centerY, centerX + radiusX, centerX + centerY);

		Pane pane = new Pane();
		pane.getChildren().addAll(bottom, top, bottomDash, lineLeft, lineRight);
		pane.setPadding(new Insets(20));

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);

		primaryStage.setTitle("Exercise14_10");
		primaryStage.setScene(new Scene(stackPane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
