package ua.natl.geometrytest;

public class Dot extends Figure {
	
	int x, y;

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public Dot(Dot dot) {
		this(dot.x, dot.y);
		//System.out.println("Dot constructor Dot");
	}
	
	public Dot(int x, int y) {
		//System.out.println("Dot constructor int, int (" + this.x + ", " + this.y);
		this.x = x;
		this.y = y;
	}
	
	public Dot() {
		//System.out.println("Dot constructor default");
		x = 0;
		y = 0;
	}
	
	@Override
	public void draw() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Dot: (" + x + ", " + y + ")";
	}
}