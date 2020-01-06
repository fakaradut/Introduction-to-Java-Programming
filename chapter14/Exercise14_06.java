package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_06 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		int row = 8;
		int column = 8;

		GridPane pane = new GridPane();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				Rectangle r = new Rectangle(35, 35);
				r.setFill((i + j) % 2 == 0 ? Color.WHITE : Color.BLACK);
				pane.add(r, j, i);
			}
		}
		
		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("Exercise14_06");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
