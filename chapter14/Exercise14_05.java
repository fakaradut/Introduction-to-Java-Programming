package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_05 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		double width = 200;
		double height = 200;
		double radius = Math.min(width, width) / 4;

		String str = "WELCOME TO JAVA ";
		String[] character = new String[str.length()];

		for (int i = 0; i < character.length; i++) {
			character[i] = str.charAt(i) + "";
		}
		Pane pane = new Pane();
		for (int i = 0; i < character.length; i++) {
			double x = radius + radius * Math.cos((i * 2 * Math.PI) / character.length);
			double y = radius + radius * Math.sin((i * 2 * Math.PI) / character.length);
			Text text = new Text(x, y, character[i]);
			text.setFont(
					Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, Math.max(height, width) / 10));
			text.setRotate((Math.toDegrees(2 * i * Math.PI) / character.length)+90);
			pane.getChildren().add(text);
		}
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);
		stackPane.setPadding(new Insets(30));

		primaryStage.setScene(new Scene(stackPane, width, height));
		primaryStage.setTitle("Exercise14_05");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
