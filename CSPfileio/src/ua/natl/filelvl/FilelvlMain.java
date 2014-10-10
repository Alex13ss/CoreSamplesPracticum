package ua.natl.filelvl;

import java.io.File;
import java.util.Date;

public class FilelvlMain {
	public static void showDir(File f, int level) {
		if (f.isDirectory()) {
			StringBuilder sb = new StringBuilder();
			for (int i=0; i<level; i++)
				sb.append("   ");
			System.out.printf("%s%s\n", sb.toString(), f.getName().toUpperCase());
			File[] files = f.listFiles();
			for (File file : files) {
				if (file.isDirectory())
					showDir(file, level+1);
			}
			for (File file : files) {
				if (file.isFile()) {
					System.out.printf("%s%s%s %s\n", 
							sb.toString(), "   ", 
							file.getName().toLowerCase(), 
							(new Date(file.lastModified())).toLocaleString());
				}
			}
		}
	}
	
	public static void showDir(File f) {
		showDir(f, 0);
	}
	
	public static void showDir(String path) {
		File f = new File(path);
		if (f.exists())
		showDir(f);
	}

	public static void main(String[] args) {
		showDir(".");
	}
}