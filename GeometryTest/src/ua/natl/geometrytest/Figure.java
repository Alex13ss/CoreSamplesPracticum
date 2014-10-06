package ua.natl.geometrytest;

import java.util.ArrayList;

public abstract class Figure {
	
	private static ArrayList<Figure> figures = new ArrayList<Figure>();
	
	public Figure() {
		figures.add(this);
		//System.out.println("Figure constructor.");
	}
	
	public abstract void draw(); /*{
		System.out.println("Figure show.");
	}*/
	
	public static void drawScene() {
		for (Figure f : figures)
			f.draw();
	}
	public static void scaleScene(double n) {
		for (Figure f : figures)
			if (f instanceof Scaleable)
				((Scaleable)f).scale(n);
	}
}