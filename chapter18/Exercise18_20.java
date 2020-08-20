package chapter18;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise18_20 extends Application {
	public static int NUMBER_OF_CIRCLE = 20;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stackPane = new StackPane();
		stackPane = (StackPane) getCircles(NUMBER_OF_CIRCLE, stackPane);
		stackPane.setPadding(new Insets(10));

		Scene scene = new Scene(stackPane);
		primaryStage.setTitle("Exercise18_20");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public Pane getCircles(int number, Pane pane) {
		return getCircles(0, number, pane);
	}

	private Pane getCircles(int i, int number, Pane pane) {
		if (i <= number) {
			Circle c = new Circle(i * 10);
			c.setFill(Color.TRANSPARENT);
			c.setStroke(Color.BLACK);
			pane.getChildren().add(c);
			getCircles(++i, number, pane);
		}
		return pane;
	}

}
