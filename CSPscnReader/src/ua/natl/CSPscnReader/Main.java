package ua.natl.CSPscnReader;

public class Main {

	public static void main(String[] args) {
		Reader r = new Reader();
		r.Scan();
		r.i = count(r.i);
		r.k = count(r.k);
		System.out.println("Now the value of first number = " + r.i);
		System.out.println("Now the value of second number = " + r.k);
	}
	
	private static int count(int x){
		x = x + 1;
		return x;
	}
}