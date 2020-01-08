package chapter14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_12 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox(10);
		double width = 90;

		Rectangle project = new Rectangle(width, 40, Color.RED);
		Rectangle quiz = new Rectangle(width, 20, Color.BLUE);
		Rectangle midterm = new Rectangle(width, 60, Color.GREEN);
		Rectangle finale = new Rectangle(width, 80, Color.ORANGE);

		Text t1 = new Text("Project -- 20%");
		Text t2 = new Text("Quiz -- 10%");
		Text t3 = new Text("Midterm -- 30%");
		Text t4 = new Text("Final -- 40%");

		hBox.setAlignment(Pos.BOTTOM_CENTER);
		set(hBox, project, t1);
		set(hBox, quiz, t2);
		set(hBox, midterm, t3);
		set(hBox, finale, t4);

		primaryStage.setScene(new Scene(hBox));
		primaryStage.setTitle("Exercise14_12");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void set(Pane p, Rectangle r, Text t) {
		VBox vBox = new VBox();
		vBox.getChildren().add(t);
		vBox.getChildren().add(r);
		vBox.setAlignment(Pos.BOTTOM_CENTER);
		p.getChildren().add(vBox);
	}
}
