package ua.natl.cspserialization2;

import java.io.*;

public class PIMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersonInfo pi = new PersonInfo("Alex", 25);
		pi.showInfo();
		
		File file = new File(".\\PersonInfo.ser");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fs = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(pi);
		fs.close();
		os.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("***** Object reconstruction *****");
		PersonInfo restoredPI = (PersonInfo)ois.readObject();
		restoredPI.showInfo();
	}
}