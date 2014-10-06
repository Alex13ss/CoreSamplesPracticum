package ua.natl.geometrytest;

public class GeometryMain {

	public static void main(String[] args) {
		/*
		Dot d1 = new Dot(100, 200);
		Circle c1 = new Circle(d1, 50);
		*/
		Circle c1 = new Circle(new Dot(100, 200), 50);
		//c1.scale(2);
		c1.move(10, 20);
		Figure.scaleScene(2);
		Figure.drawScene();
	}
}