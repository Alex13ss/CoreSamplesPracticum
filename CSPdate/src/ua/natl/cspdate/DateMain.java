package ua.natl.cspdate;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateMain {
	enum Weekdays {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date now = new Date();
		Weekdays w = Weekdays.values()[now.getDay()];
		System.out.println(w);
		
		String date = "1989/01/27";
		Date bday = new Date(Date.parse(date));
		bday.setYear(now.getYear());
		System.out.println(bday.toLocaleString());
		if (bday.after(now)) {
			System.out.println("You haven't celebrated your Bday this year!");
		}
		
		// ************* Calendar ************* 
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		cal.set(Calendar.YEAR, 2089);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 27);
		
		DateFormat sdf = DateFormat.getDateInstance(DateFormat.LONG, new Locale("uk", "uk"));
		DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.UK);
		DateFormat timeFormatterUS = DateFormat.getTimeInstance(DateFormat.LONG, Locale.US);
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(timeFormatter.format(cal.getTime()));
		System.out.println(timeFormatterUS.format(cal.getTime()));
	}
}