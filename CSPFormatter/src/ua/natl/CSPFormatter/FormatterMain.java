package ua.natl.CSPFormatter;

import java.util.Formatter;
import java.util.Scanner;

public class FormatterMain {
	static Formatter x;
	static Scanner scn;

	public static void main(String[] args) {
		try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("How old are you?");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("What is your name?");
			String b = scn.next();
			System.out.println("Where are you live?");
			String c = scn.next();
			x.format("My name is %s, I'm %d years old, I'm living in %s.", b, a, c);
			x.close();
		}catch(Exception e){e.printStackTrace();}
	}
}