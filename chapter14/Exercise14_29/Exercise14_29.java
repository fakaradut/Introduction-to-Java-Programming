package chapter14.Exercise14_29;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercise14_29 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BeanMachine bm1 = new BeanMachine();
		
		StackPane stackPane = new StackPane();
		stackPane.setPadding(new Insets(20,20,40,60));
		stackPane.getChildren().addAll(bm1);

		primaryStage.setScene(new Scene(stackPane));
		primaryStage.setTitle("Exercise14_29");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
