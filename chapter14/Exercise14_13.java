package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_13 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Arc arc1 = new Arc(100, 100, 100, 100, 0, 72);
		arc1.setType(ArcType.ROUND);
		arc1.setFill(Color.RED);

		Arc arc2 = new Arc(100, 100, 100, 100, 72, 36);
		arc2.setType(ArcType.ROUND);
		arc2.setFill(Color.BLUE);

		Arc arc3 = new Arc(100, 100, 100, 100, 108, 108);
		arc3.setType(ArcType.ROUND);
		arc3.setFill(Color.GREEN);

		Arc arc4 = new Arc(100, 100, 100, 100, 216, 144);
		arc4.setType(ArcType.ROUND);
		arc4.setFill(Color.ORANGE);

		Text t1 = new Text(80, 0, "Quiz -- %10");
		Text t2 = new Text(120, 80, "Project -- %20");
		Text t3 = new Text(10, 100, "Midterm -- %30");
		Text t4 = new Text(110, 180, "Final -- %40");

		Pane pane = new Pane();
		pane.getChildren().addAll(arc1, arc2, arc3, arc4, t1, t2, t4, t3);

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);
		stackPane.setPadding(new Insets(20));

		primaryStage.setScene(new Scene(stackPane));
		primaryStage.setTitle("Exercise14_13");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
