package ua.natl.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileioMain {
	public static final String fileName1 = ".\\test.txt";
	public static final String dirName1 = ".";
		
	public static void main(String[] args) throws IOException {
		File f1 = new File(fileName1);
		if (!f1.exists()) {
			System.out.printf("File %s doesn't exist!", f1.getAbsolutePath());
		} else {
			String fullName = f1.getCanonicalPath();
			Date lm = new Date(f1.lastModified());
			System.out.printf("File: %s Date: %s Size: %d\n",
					fullName, lm.toLocaleString(), f1.length());
		}
		File dir1 = new File(dirName1);
		System.out.println(dir1.getCanonicalPath());
		if (dir1.isDirectory()) {
			File[] files = dir1.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println(file.getName().toUpperCase());
				} else {
					System.out.println(file.getName().toLowerCase());
				}
			}
		}
	}
}