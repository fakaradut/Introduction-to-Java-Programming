package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise14_09 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane gridPane = new GridPane();
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(10));

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				StackPane pane = new StackPane();
				Circle circle = new Circle(50);
				circle.setFill(Color.WHITE);
				circle.setStroke(Color.BLACK);

				pane.getChildren().add(circle);
				pane = new Fans(pane).getFans();
				gridPane.add(pane, j, i);
			}
		}

		primaryStage.setTitle("Exercise14_09");
		primaryStage.setScene(new Scene(gridPane));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}

class Fans extends StackPane {
	private StackPane fans;

	public Fans(StackPane stackPane) {
		fans = stackPane;
		for (int i = 0; i < 4; i++) {
			Pane pane = new Pane();
			Arc arc = new Arc(50, 50, 40, 40, 30 + (90 * i), 35);
			arc.setFill(Color.BLACK);
			arc.setType(ArcType.ROUND);
			arc.setStroke(Color.BLACK);
			pane.getChildren().add(arc);
			fans.getChildren().add(pane);
		}
	}

	public StackPane getFans() {
		return this.fans;
	}
}
