package chapter10.Exercise10_12;

public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	public Triangle2D() {
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}

	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		p1 = new MyPoint(x1, y1);
		p2 = new MyPoint(x2, y2);
		p3 = new MyPoint(x3, y3);
	}
	
	public Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public double getArea() {
		double s1 = p1.distance(p2);
		double s2 = p1.distance(p3);
		double s3 = p2.distance(p3);
		double s = (s1 + s2 + s3) / 2;

		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

	public double getPerimeter() {
		return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
	}

	public boolean contains(MyPoint p) {
		double maxX = Math.max(Math.max(p1.getX(), p2.getX()), p3.getX());
		double minX = Math.min(Math.min(p1.getX(), p2.getX()), p3.getX());
		double maxY = Math.max(Math.max(p1.getY(), p2.getY()), p3.getY());
		double minY = Math.min(Math.min(p1.getY(), p2.getY()), p3.getY());

		if (p.getX() < minX || p.getX() > maxX || p.getY() < minY || p.getY() > maxY) {
			return false;
		} else if (onTheSameLine(p.getX(), p.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY())) {
			return true;
		} else if (onTheSameLine(p.getX(), p.getY(), p3.getX(), p3.getY(), p2.getX(), p2.getY())) {
			return true;
		} else if (onTheSameLine(p.getX(), p.getY(), p3.getX(), p3.getY(), p2.getX(), p2.getY())) {
			return true;
		}

		if (isIntersect(p.getX(), p.getY(), p2.getX(), p2.getY(), p1.getX(), p1.getY(), p3.getX(), p3.getY())) {
			double[] xy = getIntersectingPoint(p.getX(), p.getY(), p2.getX(), p2.getY(), p1.getX(), p1.getY(),
					p3.getX(), p3.getY());
			if (p.distance(p2) > p2.distance(xy[0], xy[1])) {
				if (!(p2.getX() == xy[0] && p2.getY() == xy[1])) {
					return false;
				}
			}
		}

		if (isIntersect(p.getX(), p.getY(), p1.getX(), p1.getY(), p3.getX(), p3.getY(), p2.getX(), p2.getY())) {
			double[] xy = getIntersectingPoint(p.getX(), p.getY(), p1.getX(), p1.getY(), p3.getX(), p3.getY(),
					p2.getX(), p2.getY());
			if (p.distance(p1) > p1.distance(xy[0], xy[1])) {
				if (!(p1.getX() == xy[0] && p1.getY() == xy[1])) {
					return false;
				}
			}
		}
		if (isIntersect(p.getX(), p.getY(), p3.getX(), p3.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY())) {
			double[] xy = getIntersectingPoint(p.getX(), p.getY(), p3.getX(), p3.getY(), p1.getX(), p1.getY(),
					p2.getX(), p2.getY());
			if (p.distance(p3) > p3.distance(xy[0], xy[1])) {
				if (!(p3.getX() == xy[0] && p3.getY() == xy[1])) {
					return false;
				}
			}
		}
		return true;

	}

	public boolean contains(Triangle2D t) {
		return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
	}

	public boolean overlaps(Triangle2D t) {
		MyPoint[] listP = new MyPoint[3];
		MyPoint[] listT = new MyPoint[3];
		listP[0] = p1;
		listP[1] = p2;
		listP[2] = p3;
		listT[0] = t.getP1();
		listT[1] = t.getP2();
		listT[2] = t.getP3();

		for (int i = 0; i < listT.length; i++) {
			for (int j = 0; j < listT.length; j++) {
				for (int j2 = 0; j2 < listT.length; j2++) {
					for (int k = 0; k < listT.length; k++) {
						if (extracted(listP[i], listP[j], listT[j2], listT[k])) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean extracted(MyPoint t1, MyPoint t2, MyPoint p1, MyPoint p2) {
		if (isIntersect(t1.getX(), t1.getY(), t2.getX(), t2.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY())) {
			double[] point = getIntersectingPoint(t1.getX(), t1.getY(), t2.getX(), t2.getY(), p1.getX(), p1.getY(),
					p2.getX(), p2.getY());
			double distanceP1andP2 = p1.distance(p2);
			double distanceT1andT2 = t1.distance(t2);

			double pointDistanceToP1 = p1.distance(point[0], point[1]);
			double pointDistanceToP2 = p2.distance(point[0], point[1]);
			double pointDistanceToT1 = t1.distance(point[0], point[1]);
			double pointDistanceToT2 = t2.distance(point[0], point[1]);
			if (pointDistanceToP1 + pointDistanceToP2 <= distanceP1andP2
					&& pointDistanceToT1 + pointDistanceToT2 <= distanceT1andT2) {
				return true;
			}
		}

		return false;
	}

	public boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
	}

	public boolean isIntersect(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);

		double disc = a * d - b * c;
		return disc == 0 ? false : true;
	}

	public double[] getIntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		double[] point = new double[2];

		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = a * x1 - (x1 - x2) * y1;
		double f = c * x3 - (x3 - x4) * y3;

		double disc = a * d - b * c;
		point[0] = (e * d - b * f) / disc;
		point[1] = (a * f - e * c) / disc;

		return disc == 0 ? null : point;

	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

}
