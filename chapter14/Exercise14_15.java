package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_15 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		pane.setPadding(new Insets(20));

		Polygon polygon = new Polygon();
		polygon.setStroke(Color.BLACK);
		polygon.setFill(Color.RED);
		ObservableList<Double> list = polygon.getPoints();

		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;

		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
		}
		polygon.setRotate(22.5);

		Text text = new Text("STOP");
		text.setFill(Color.WHITE);
		text.setStrokeWidth(5);
		text.setFont(Font.font(30));
		
		pane.getChildren().addAll(polygon, text);
		primaryStage.setTitle("Exercise14_15");
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
