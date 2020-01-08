package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Exercise14_17 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Arc arc = new Arc(40, 120, 20, 10, 0, 180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);

		Polyline lines = new Polyline();
		ObservableList<Double> points = lines.getPoints();
		points.addAll(40., 110., 40., 10., 90., 10., 90., 70.);

		Circle head = new Circle(90, 30, 10);
		head.setFill(Color.WHITE);
		head.setStroke(Color.BLACK);

		Line leftArm = new Line(90, 30, 70, 50);
		Line rightArm = new Line(90, 30, 110, 50);
		Line leftLeg = new Line(90, 70, 70, 100);
		Line rightLeg = new Line(90, 70, 110, 100);

		pane.getChildren().addAll(arc, lines, leftArm, leftLeg, rightArm, rightLeg, head);
		StackPane stackPane = new StackPane();
		stackPane.setPadding(new Insets(20));
		stackPane.getChildren().add(pane);

		primaryStage.setScene(new Scene(stackPane, 150, 200));
		primaryStage.setTitle("Exercise14_17");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
