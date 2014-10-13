package ua.natl.filercw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadCopyWrite {
	public static final String sourceFileName = "source.txt";
	public static final String destFileName = "dest.txt";

	public static void main(String[] args) throws IOException {
		File sourceFile = new File(sourceFileName);
		if (!sourceFile.exists()) {
			System.out.printf("File %s is not found!", sourceFile.getCanonicalPath());
		} else {
			BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
			PrintWriter writer = new PrintWriter(destFileName);
			String line = null;
			int words = 0, lines = 0, chars = 0;
			while ( (line = reader.readLine()) != null) {
				lines++;
				//chars += line.length();
				String[] ws = line.trim().split("\\s+");
				words += ws.length;
				for (String s : ws)
					chars += s.length();
				writer.println(line.toUpperCase());
			}
			reader.close();
			writer.close();
			System.out.printf("Chars copied: %d\nWords copied: %d\nLines copied: %d\n",
					chars, words, lines);
		}
	}
}