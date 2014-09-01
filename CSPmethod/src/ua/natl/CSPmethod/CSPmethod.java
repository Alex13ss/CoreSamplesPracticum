package ua.natl.CSPmethod;

public class CSPmethod {

	public static void main(String[] args) {
		int i = 3;
		int k = 5;
		i = count(i);
		k = count(k);
		System.out.println(i);
		System.out.println(k);
	}
	
	private static int count(int x){
		x = x + 1;
		return x;
	}
}