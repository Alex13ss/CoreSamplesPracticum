package ua.natl.CSParray;

import java.util.Random;

public class CSParray {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] m = new int[5];
		
		for(int i=0;i<m.length;i++){
			m[i] = r.nextInt(777);
			System.out.println(m[i]);
		}
		
	}
}