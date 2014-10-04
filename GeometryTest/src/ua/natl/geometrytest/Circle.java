package ua.natl.geometrytest;

public class Circle extends Figure {

	private Dot center;
	private int radius;
	{ radius = 1; }

	public Circle() {
		center = new Dot();
	}
	
	public Circle(int x, int y, int r) {
		this();
		setX(x);
		setY(y);
		setRadius(r);
	}
	
	public Circle(Dot center, int r) {
		this(center.x, center.y, r);
	}
	
	public Circle(Circle c) {
		this(c.getX(), c.getY(), c.getRadius());
	}
	
	public int getX() {
		return center.x;
	}
	public int getY() {
		return center.y;
	}
	public void setX(int x) {
		center.x = x;
	}
	public void setY(int y) {
		center.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int r) {
		if (r > 0)
			radius = r;
	}
	
	@Override
	public void draw() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return String.format("Circle (" + getX() + ", " 
				+ getY() + "), radius: " + getRadius());
	}
}