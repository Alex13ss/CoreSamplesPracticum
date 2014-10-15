package ua.natl.datecounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DCMain {

	public static void main(String[] args) throws ParseException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Bday date: ");
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("uk", "uk"));
		Date b = f.parse(reader.readLine());
		Calendar c = Calendar.getInstance();
		//		(new Locale("uk", "uk"));
		c.setTime(b);
		c.set(Calendar.YEAR, c.get(Calendar.YEAR) + 100);
		//System.out.println(f.format(c.getTime()));
		String s = String.format("%1$tY.%1$tm.%1$td %1$tA", c);
		System.out.println(s);
		
	}
}