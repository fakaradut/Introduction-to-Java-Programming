package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_19 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Pane linePane = new Pane();

		Polyline sine = new Polyline();
		ObservableList<Double> list1 = sine.getPoints();
		for (int x = -170; x <= 170; x++) {
			list1.add(x + 200.0);
			list1.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		sine.setStroke(Color.RED);

		Polyline cosine = new Polyline();
		ObservableList<Double> list2 = cosine.getPoints();
		for (int x = -150; x <= 190; x++) {
			list2.add(x + 165.0);
			list2.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		cosine.setStroke(Color.BLUE);

		Line horizontal = new Line(10, 100, 380, 100);
		Line vertical = new Line(190, 10, 190, 200);

		Line vLeftArrow = new Line(190, 10, 185, 20);
		Line vRightArrow = new Line(190, 10, 195, 20);

		Line hLeftArrow = new Line(380, 100, 370, 95);
		Line hRightArrow = new Line(380, 100, 370, 105);

		Text t1 = new Text(90, 110, "-2\u03c0");
		Text t2 = new Text(145, 110, "-\u03c0");
		Text t3 = new Text(190, 110, "0");
		Text t4 = new Text(240, 110, "\u03c0");
		Text t5 = new Text(295, 110, "2\u03c0");

		linePane.getChildren().addAll(t1, t2, t3, t4, t5, hLeftArrow, hRightArrow, vertical, horizontal, vLeftArrow,
				vRightArrow, cosine, sine);
		pane.setPadding(new Insets(20));
		pane.getChildren().addAll(linePane);
		primaryStage.setTitle("Exercise14_19");
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
