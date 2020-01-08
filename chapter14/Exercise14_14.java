package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_14 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Rectangle rearRectangle = new Rectangle();
		rearRectangle.widthProperty().bind(pane.widthProperty().multiply(0.6));
		rearRectangle.heightProperty().bind(pane.heightProperty().multiply(0.6));
		rearRectangle.xProperty().bind(pane.widthProperty().multiply(0.3));
		rearRectangle.yProperty().bind(pane.heightProperty().multiply(0.1));
		rearRectangle.setFill(Color.WHITE);
		rearRectangle.setStroke(Color.BLACK);

		Rectangle frontRectangle = new Rectangle();
		frontRectangle.widthProperty().bind(pane.widthProperty().multiply(0.6));
		frontRectangle.heightProperty().bind(pane.heightProperty().multiply(0.6));
		frontRectangle.xProperty().bind(pane.widthProperty().multiply(0.1));
		frontRectangle.yProperty().bind(pane.heightProperty().multiply(0.3));
		frontRectangle.setStroke(Color.BLACK);
		frontRectangle.setFill(Color.color(0, 0, 0, 0));

		Line lineUpperLeft = new Line();
		lineUpperLeft.startXProperty().bind(pane.widthProperty().multiply(0.1));
		lineUpperLeft.startYProperty().bind(pane.heightProperty().multiply(0.3));
		lineUpperLeft.endXProperty().bind(pane.widthProperty().multiply(0.3));
		lineUpperLeft.endYProperty().bind(pane.heightProperty().multiply(0.1));

		Line lineUpperRight = new Line();
		lineUpperRight.startXProperty().bind(pane.widthProperty().multiply(0.7));
		lineUpperRight.startYProperty().bind(pane.heightProperty().multiply(0.3));
		lineUpperRight.endXProperty().bind(pane.widthProperty().multiply(0.9));
		lineUpperRight.endYProperty().bind(pane.heightProperty().multiply(0.1));

		Line lineBottomLeft = new Line();
		lineBottomLeft.startXProperty().bind(pane.widthProperty().multiply(0.1));
		lineBottomLeft.startYProperty().bind(pane.heightProperty().multiply(0.9));
		lineBottomLeft.endXProperty().bind(pane.widthProperty().multiply(0.3));
		lineBottomLeft.endYProperty().bind(pane.heightProperty().multiply(0.7));

		Line lineBottomRight = new Line();
		lineBottomRight.startXProperty().bind(pane.widthProperty().multiply(0.7));
		lineBottomRight.startYProperty().bind(pane.heightProperty().multiply(0.9));
		lineBottomRight.endXProperty().bind(pane.widthProperty().multiply(0.9));
		lineBottomRight.endYProperty().bind(pane.heightProperty().multiply(0.7));

		pane.getChildren().addAll(rearRectangle, frontRectangle, lineBottomRight, lineBottomLeft, lineUpperLeft,
				lineUpperRight);
		StackPane stackPane = new StackPane();
		stackPane.setPadding(new Insets(15, 30, 30, 15));
		stackPane.getChildren().add(pane);

		primaryStage.setScene(new Scene(stackPane, 200, 200));
		primaryStage.setTitle("Exercise14_14");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
