package chapter04;

public class Exercise04_03 {

	public static void main(String[] args) {
		// Atlanta
		double x1 = 33.753746;
		double y1 = -84.386330;
		// Savannah
		double x2 = 32.0835407;
		double y2 = -81.0998342;
		// Charlotte
		double x3 = 35.227085;
		double y3 = -80.843124;
		// Orlando
		double x4 = 28.538336;
		double y4 = -81.379234;

		double radius = 6371.01;

		// distance between atlanta and charlotte
		double distanceAtoC = radius * Math.acos((Math.sin(Math.toRadians(x1))) * (Math.sin(Math.toRadians(x3)))
				+ (Math.cos(Math.toRadians(x1)) * (Math.cos(Math.toRadians(x3))))
						* (Math.cos(Math.toRadians(y1 - y3))));
		// distance between charlotte and savannah
		double distanceCtoS = radius * Math.acos((Math.sin(Math.toRadians(x3))) * (Math.sin(Math.toRadians(x2)))
				+ (Math.cos(Math.toRadians(x3)) * (Math.cos(Math.toRadians(x2))))
						* (Math.cos(Math.toRadians(y3 - y2))));
		// distance between savannah and orlando
		double distanceStoO = radius * Math.acos((Math.sin(Math.toRadians(x4))) * (Math.sin(Math.toRadians(x2)))
				+ (Math.cos(Math.toRadians(x4)) * (Math.cos(Math.toRadians(x2))))
						* (Math.cos(Math.toRadians(y4 - y2))));
		// distance between orlando and atlanta
		double distanceOtoA = radius * Math.acos((Math.sin(Math.toRadians(x1))) * (Math.sin(Math.toRadians(x4)))
				+ (Math.cos(Math.toRadians(x1)) * (Math.cos(Math.toRadians(x4))))
						* (Math.cos(Math.toRadians(y1 - y4))));

		// distance between atlanta and savannah
		double distanceStoA = radius * Math.acos((Math.sin(Math.toRadians(x1))) * (Math.sin(Math.toRadians(x2)))
				+ (Math.cos(Math.toRadians(x1)) * (Math.cos(Math.toRadians(x2))))
						* (Math.cos(Math.toRadians(y1 - y2))));

		double s1 = (distanceAtoC + distanceCtoS + distanceStoA) / 2;
		double area1 = Math.sqrt(s1 * (s1 - distanceAtoC) * (s1 - distanceCtoS) * (s1 - distanceStoA));

		double s2 = (distanceStoA + distanceOtoA + distanceStoO) / 2;
		double area2 = Math.sqrt(s2 * (s2 - distanceStoA) * (s2 - distanceOtoA) * (s2 - distanceStoO));

		System.out.println("Area between four cities : " + (area2 + area1));

	}
}
