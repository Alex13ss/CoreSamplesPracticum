package ua.natl.CSPquadraticEquation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

public class QEquation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		out.print("a = ");
		double a = Double.parseDouble(reader.readLine());
		out.print("b = ");
		double b = Double.parseDouble(reader.readLine());
		out.print("c = ");
		double c = Double.parseDouble(reader.readLine());
		
		double d = Math.pow(b, 2) - 4 * a * c;
		
		if (d < 0) {
			out.println("No solutions.");
		} else {
			if (d == 0) {
				double x = -b / (2 * a);
				out.printf("The only x = %g\n", x);
			} else {
				double ds = Math.sqrt(d);
				double x1 = (-b + ds) / (2 * a);
				double x2 = (-b - ds) / (2 * a);
				out.printf("x1 = %g\nx2 = %g\n", x1, x2);
			}
		}	
	}
}