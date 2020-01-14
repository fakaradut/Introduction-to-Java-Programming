package chapter14.Exercise14_26;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise14_26 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		ClockPane c1 = new ClockPane(4, 20, 45);
		ClockPane c2 = new ClockPane(22, 46, 15);

		HBox pane = new HBox();
		pane.getChildren().addAll(c1, c2);

		primaryStage.setTitle("Exercise14_26");
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
