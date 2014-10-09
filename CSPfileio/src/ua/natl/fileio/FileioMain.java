package ua.natl.fileio;

import java.io.File;

public class FileioMain {
	public static final String fileName1 = ".\\test.txt";
		
	public static void main(String[] args) {
		File f1 = new File(fileName1);
		if (!f1.exists())
			System.out.printf("File %s doesn't exist!", f1.getAbsolutePath());
	}
}