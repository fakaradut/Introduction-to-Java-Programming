package chapter14;

import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_24 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter five points: ");

		double maxX = 0;
		double maxY = 0;

		Polygon polygon = new Polygon();
		polygon.setFill(Color.TRANSPARENT);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> pointsOfPolygon = polygon.getPoints();

		for (int i = 0; i < 4; i++) {
			pointsOfPolygon.add(input.nextDouble());
			maxX = pointsOfPolygon.get(i) > maxX ? pointsOfPolygon.get(i) : maxX;
			pointsOfPolygon.add(input.nextDouble());
			maxY = pointsOfPolygon.get(i + 1) > maxY ? pointsOfPolygon.get(i + 1) : maxY;
		}

		Circle circle = new Circle(input.nextDouble(), input.nextDouble(), 5, Color.BLACK);
		maxX = circle.getCenterX() > maxX ? circle.getCenterX() : maxX;
		maxY = circle.getCenterY() > maxY ? circle.getCenterY() : maxY;

		input.close();

		Text text = new Text();
		text.setX(maxX / 4);
		text.setY(maxY + 40);
		if (polygon.contains(circle.getCenterX(), circle.getCenterX()))
			text.setText("The point is inside the polygon");
		else
			text.setText("The point is not inside the polygon");

		pane.getChildren().addAll(circle, polygon, text);

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(pane);
		stackPane.setPadding(new Insets(20));

		primaryStage.setScene(new Scene(stackPane));
		primaryStage.setTitle("Exercise14_24");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
