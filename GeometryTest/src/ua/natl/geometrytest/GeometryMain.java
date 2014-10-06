package ua.natl.geometrytest;

public class GeometryMain {

	public static void main(String[] args) {
		/*
		Dot d1 = new Dot(100, 200);
		Circle c1 = new Circle(d1, 50);
		*/
		new Circle(new Dot(100, 200), 50);
		Figure.drawScene();
	}
}