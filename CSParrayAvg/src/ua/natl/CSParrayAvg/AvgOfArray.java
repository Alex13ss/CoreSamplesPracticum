package ua.natl.CSParrayAvg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class AvgOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] m = new int[4];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i=0; i < m.length; i++) {
			out.printf("m[%d] = ", i);
			m[i] = Integer.parseInt(reader.readLine());
		}
		int max = m[0], min = m[0];
		int sum = 0;
		double avg;
		for (int x : m) {
			sum += x;
			if (max < x) max = x;
			if (min > x) min = x;
		}
		avg = (double)sum/m.length;
		out.printf("Average number = %g%n"
				+ "Maximum number = %d%n"
				+ "Minimum number = %d%n", avg, max, min);
	}
}