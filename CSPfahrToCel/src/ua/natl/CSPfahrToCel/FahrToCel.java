package ua.natl.CSPfahrToCel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class FahrToCel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		out.print("T(F) = ");
		double tf = Double.parseDouble(reader.readLine());
		double tc = (tf - 32.0) * 5.0 / 9.0;
		out.printf("T(C) = %g\n", tc);
	}
}