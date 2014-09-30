package ua.natl.CSPFormatter1;

import static java.lang.System.out;

public class FormatterTable {

	public static void main(String[] args) {
		int n;
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				n = i *j;
				out.printf("%4d", n);
			}
			out.println();
		}
	}
}