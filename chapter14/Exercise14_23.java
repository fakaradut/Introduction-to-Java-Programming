package chapter14;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_23 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle r1 = new Rectangle(x1 - w1 / 2, y1 - h1 / 2, w1, h1);
		Rectangle r2 = new Rectangle(x2 - w2 / 2, y2 - h2 / 2, w2, h2);
		r1.setFill(Color.color(0, 0, 0, 0));
		r1.setStroke(Color.BLACK);
		r2.setFill(Color.color(0, 0, 0, 0));
		r2.setStroke(Color.BLACK);

		Text text = new Text();

		double xDistance = r1.getX() >= r2.getX() ? r1.getX() - r2.getX() : r2.getX() - r1.getX();
		double yDistance = r1.getY() >= r2.getY() ? r1.getY() - r2.getY() : r2.getY() - r1.getY();

		if (xDistance <= (r1.getWidth() - r2.getWidth()) / 2 && yDistance <= (r1.getHeight() - r2.getHeight()) / 2)
			text.setText("One rectangle is contained in another");
		else if (xDistance <= (r1.getWidth() + r2.getWidth()) / 2 && yDistance <= (r1.getHeight() + r2.getHeight()) / 2)
			text.setText("The rectangles overlap");
		else
			text.setText("The rectangles do not overlap");

		text.setX(Math.max(x1 + w1, x2 + w2) / 3);
		text.setY(Math.max(y1 + h1, y2 + h2) + 20);
		Pane pane = new Pane();

		pane.getChildren().addAll(r1, r2, text);
		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("Exercise14_23");
		primaryStage.show();
	}

	static double x1;
	static double y1;
	static double w1;
	static double h1;
	static double x2;
	static double y2;
	static double w2;
	static double h2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		w1 = input.nextDouble();
		h1 = input.nextDouble();

		System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		w2 = input.nextDouble();
		h2 = input.nextDouble();

		input.close();

		launch(args);
	}

}
