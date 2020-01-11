package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_18 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Polyline polyline = new Polyline();
		ObservableList<Double> list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -100; x <= 100; x++) {
			list.add(x + 200.0);
			list.add(200 - scaleFactor * x * x);
		}

		Line horizontal = new Line(10, 200, 390, 200);
		Line vertical = new Line(200, 30, 200, 240);

		Line vLeftArrow = new Line(200, 30, 195, 40);
		Line vRightArrow = new Line(200, 30, 205, 40);

		Line hLeftArrow = new Line(390, 200, 380, 195);
		Line hRightArrow = new Line(390, 200, 380, 205);

		Text text1 = new Text(380, 170, "X");
		Text text2 = new Text(220, 40, "Y");

		pane.getChildren().addAll(polyline, vertical, horizontal, text1, text2, vLeftArrow, vRightArrow, hLeftArrow,
				hRightArrow);

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);
		stackPane.setPadding(new Insets(20));

		primaryStage.setScene(new Scene(stackPane));
		primaryStage.setTitle("Exercise14_18");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
