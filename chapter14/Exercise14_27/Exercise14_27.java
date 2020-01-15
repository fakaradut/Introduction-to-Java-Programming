package chapter14.Exercise14_27;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise14_27 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		ClockPane c1 = new ClockPane();

		HBox pane = new HBox();
		pane.getChildren().addAll(c1);

		primaryStage.setTitle("Exercise14_27");
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}