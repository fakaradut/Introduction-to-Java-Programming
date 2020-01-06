package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane pane = new GridPane();
		pane.setPadding(new Insets(15));
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(15);
		pane.setVgap(15);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ImageView x = new ImageView(new Image("image/x.gif"));
				ImageView o = new ImageView(new Image("image/o.gif"));
				int random = (int) (Math.random() * 3);
				if (random == 0) {
					pane.add(x, i, j);
				} else if (random == 1) {
					pane.add(o, i, j);
				}
			}
		}

		primaryStage.setScene(new Scene(pane, 200, 200));
		primaryStage.setTitle("Exercise14_02");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
