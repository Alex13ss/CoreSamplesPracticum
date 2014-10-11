package ua.natl.frfw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
	}
}