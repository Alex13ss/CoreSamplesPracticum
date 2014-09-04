package ua.natl.CSPscnReader;

import java.util.Scanner;

public class Reader {
	int i,k;
	
	public void Scan(){
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number: ");
		i = scn.nextInt();
		System.out.println("Enter second number: ");
		k = scn.nextInt();	
	}
}