package ua.natl.CSPsortCol;

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCol {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		String name;
		out.println("Enter names below:");
		do {
			name = reader.readLine();
			if (!name.isEmpty())
			list.add(name);
		} while (!name.isEmpty());
		
		//for (int i = 0; i < list.size(); i++) {out.println(list.get(i));}
		
		out.println("Sorted:");
		Object[] m = list.toArray();
		Arrays.sort(m);
		List listSorted = Arrays.asList(m);
		for (Object nm : listSorted)
			out.println(nm);
	}
}