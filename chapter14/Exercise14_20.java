package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_20 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		double random1 = Math.random() * 200;
		double random2 = Math.random() * 200;
		double random3 = Math.random() * 200;
		double random4 = Math.random() * 200;

		drawArrowLine(random1, random2, random3, random4, pane);
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);
		stackPane.setPadding(new Insets(20));

		primaryStage.setScene(new Scene(stackPane));
		primaryStage.setTitle("Exercise14_20");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
		pane.getChildren().add(new Line(startX, startY, endX, endY));

		double slope = (startY - endY) / (startX - endX);
		double a = Math.atan(slope);
		double arrow = Math.toRadians(45);

		if (endX > startX)
			arrow = Math.toRadians(225);

		Line leftArrow = new Line(endX, endY, endX + Math.cos(a - arrow) * 10, endY + Math.sin(a - arrow) * 10);
		Line rightArrow = new Line(endX, endY, endX + Math.cos(a + arrow) * 10, endY + Math.sin(a + arrow) * 10);
		pane.getChildren().addAll(leftArrow, rightArrow);
	}

}
