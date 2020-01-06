package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_04 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox pane = new HBox();
		pane.setPadding(new Insets(20));
		pane.setAlignment(Pos.CENTER);

		for (int i = 0; i < 5; i++) {
			Text txt = new Text("Java");
			txt.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			txt.setStroke(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
			txt.setRotate(90);
			pane.getChildren().add(txt);
		}
		
		Scene scene = new Scene(pane, 250, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise14_03");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
