package chapter14;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_08 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		String directory = "image/card/";
		GridPane pane = new GridPane();
		int column = 0;
		int row = 0;
		ArrayList<ImageView> imageViews = new ArrayList<>();

		for (int i = 0; i < 54; i++) {
			Image image = new Image(directory + (i + 1) + ".png");
			imageViews.add(new ImageView(image));
		}

		shuffle(imageViews);
		for (int i = 0; i < 54; i++) {
			if (i % 9 == 0) {
				row++;
				column = 0;
			}
			pane.add(imageViews.get(i), column++, row);
		}

		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("Exercise14_08");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void shuffle(ArrayList<ImageView> imageViews) {
		for (int i = 0; i < imageViews.size(); i++) {
			ImageView temp = imageViews.get(i);
			int random = (int) (Math.random() * imageViews.size());
			imageViews.set(i, imageViews.get(random));
			imageViews.set(random, temp);
		}
	}
}
