package chapter14;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise14_03 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		ArrayList<String> images = new ArrayList<>();
		String directory = "image/card/";
		for (int i = 0; i < 52; i++) {
			images.add(directory + i + ".png");
		}
		shuffle(images);

		HBox pane = new HBox();

		for (int i = 0; i < 3; i++) {
			pane.getChildren().add(new ImageView(new Image(images.get(i))));
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_03");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void shuffle(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			int random = (int) (Math.random() * list.size());
			list.set(i, list.get(random));
			list.set(random, temp);
		}
	}
}
