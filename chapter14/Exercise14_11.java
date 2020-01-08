package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Exercise14_11 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Circle mainCircle = new Circle(100, 100, 100, Color.WHITE);
		mainCircle.setStroke(Color.BLACK);

		Arc mouth = new Arc(100, 100, mainCircle.getRadius() * 0.6, mainCircle.getRadius() * 0.6, 210, 120);
		mouth.setFill(Color.WHITE);
		mouth.setStroke(Color.BLACK);

		double[] points = { 100, 80, 120, 120, 80, 120 };
		Polygon nose = new Polygon(points);
		nose.setFill(Color.WHITE);
		nose.setStroke(Color.BLACK);

		Ellipse leftEye = new Ellipse(60, 70, 27, 20);
		Ellipse rightEye = new Ellipse(140, 70, 27, 20);
		leftEye.setFill(Color.WHITE);
		rightEye.setFill(Color.WHITE);
		leftEye.setStroke(Color.BLACK);
		rightEye.setStroke(Color.BLACK);

		Circle leftEyeball = new Circle(60, 70, 12, Color.BLACK);
		Circle rightEyeball = new Circle(140, 70, 12, Color.BLACK);

		pane.getChildren().addAll(mainCircle, mouth, nose, leftEye, rightEye, rightEyeball, leftEyeball);
		StackPane stackPane = new StackPane();
		stackPane.setPadding(new Insets(20));
		stackPane.getChildren().add(pane);
		primaryStage.setTitle("Exercise14_11");
		primaryStage.setScene(new Scene(stackPane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
