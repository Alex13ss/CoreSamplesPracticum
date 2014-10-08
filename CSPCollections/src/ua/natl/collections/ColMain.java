package ua.natl.collections;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ColMain {

	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("Mike");
		array.add("Joe");
		array.add("Alex");
		
		/*
		Iterator<String> iterator = array.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();	
			out.println(s);
		}
		*/
		
		// equals to
		
		/*
		for (Object o : array)
		out.println(o);
		*/
		
		for (int i=0; i<array.size(); i++)
			out.println(array.get(i));
		out.println(array.get(1));
		
		Map<String, Integer> persons = new Hashtable<String, Integer>();
		
		persons.put("Alex", 25);
		persons.put("Jonny", 4);
		persons.put("Stui", 13);
		
		for (Map.Entry<String, Integer> p : persons.entrySet()) {
			out.printf("%s %d\n", p.getKey(), p.getValue());	
		}		
		for (String key : persons.keySet()) {
			out.printf("%s %d\n", key, persons.get(key));
		}
	}
}