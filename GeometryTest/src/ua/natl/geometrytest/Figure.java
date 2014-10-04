package ua.natl.geometrytest;

import java.util.ArrayList;

public class Figure {
	
	private static ArrayList<Figure> figures = new ArrayList<Figure>();
	
	public Figure() {
		figures.add(this);
		//System.out.println("Figure constructor.");
	}
	
	public void draw() {
		System.out.println("Figure show.");
	}
	
	public static void drawScene() {
		for (Figure f : figures)
			f.draw();
	}
}