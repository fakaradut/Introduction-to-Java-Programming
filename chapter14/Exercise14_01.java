package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image image1 = new Image("image/uk.jpg");
		Image image2 = new Image("image/4.jpg");
		Image image3 = new Image("image/china.jpg");
		Image image4 = new Image("image/us.jpg");

		GridPane pane = new GridPane();
		pane.add(new ImageView(image1), 0, 0);
		pane.add(new ImageView(image2), 1, 0);
		pane.add(new ImageView(image3), 0, 1);
		pane.add(new ImageView(image4), 1, 1);

		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("Exercise14_01");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
