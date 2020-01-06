package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_07 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		int row = 10;
		int column = 10;

		GridPane pane = new GridPane();
	
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				TextField tf = new TextField();
				tf.setText((int) (Math.random() * 2) + "");
				tf.setPrefColumnCount(1);
				pane.add(tf, j, i);
			}
		}
		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("Exercise14_07");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
