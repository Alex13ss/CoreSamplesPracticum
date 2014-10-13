package ua.natl.frfw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FrFwMain {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("test.txt");
		while (fs.available() != 0) {
			int b = fs.read();
			char ch = (char)b;
			System.out.print(ch);
		}
		fs.close();
		
		FileOutputStream fo = new FileOutputStream("out.txt");
		String s = "Hello";
		byte[] bytes = s.getBytes();
		fo.write(bytes);
		fo.close();
		
		BufferedReader reader = new BufferedReader (new FileReader("test.txt"));
		System.out.println("\n*************");
		while ( (s = reader.readLine()) != null) {
			System.out.println(s);
		}
		reader.close();
		
		PrintWriter writer = new PrintWriter("test2.txt");
		writer.printf("%s %d %c", "String", 12345, 'G');
		writer.close();
	}
}