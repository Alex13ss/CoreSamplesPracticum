package ua.natl.CSPJOptionPane;

public class DoMain {

	public static void main(String[] args) {
		ReadIt r = new ReadIt();
		r.Scan();
		r.i = count(r.i);
		r.k = count(r.k);
		r.Scan(r.i, r.k);
	}
	
	private static int count(int x){
		x *= 10;
		return x;
	}
}