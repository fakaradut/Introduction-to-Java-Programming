package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_16 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Line v1 = new Line();
		v1.setStroke(Color.RED);
		v1.setStartX(0);
		v1.startYProperty().bind(pane.heightProperty().divide(3));
		v1.endXProperty().bind(pane.widthProperty());
		v1.endYProperty().bind(pane.heightProperty().divide(3));

		Line v2 = new Line();
		v2.setStroke(Color.RED);
		v2.setStartX(0);
		v2.startYProperty().bind(pane.heightProperty().divide(1.5));
		v2.endXProperty().bind(pane.widthProperty());
		v2.endYProperty().bind(pane.heightProperty().divide(1.5));

		Line h1 = new Line();
		h1.setStroke(Color.BLUE);
		h1.setStartY(0);
		h1.startXProperty().bind(pane.widthProperty().divide(3));
		h1.endYProperty().bind(pane.heightProperty());
		h1.endXProperty().bind(pane.widthProperty().divide(3));

		Line h2 = new Line();
		h2.setStroke(Color.BLUE);
		h2.setStartY(0);
		h2.startXProperty().bind(pane.widthProperty().divide(1.5));
		h2.endYProperty().bind(pane.heightProperty());
		h2.endXProperty().bind(pane.widthProperty().divide(1.5));

		pane.getChildren().addAll(v1, v2, h1, h2);

		primaryStage.setTitle("Exercise14_16");
		primaryStage.setScene(new Scene(pane, 300, 150));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
