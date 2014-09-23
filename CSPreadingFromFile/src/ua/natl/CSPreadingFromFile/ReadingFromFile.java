package ua.natl.CSPreadingFromFile;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadingFromFile {
	static String[][] m = new String[5][3];
	static Scanner scn;

	public static void main(String[] args) {
		
		openFile();
		readFile();
		out();

	}

	private static void out() {
		
		
	}

	private static void readFile() {
		
		
	}

	private static void openFile() {
		try{
			scn = new Scanner(new File("res//1.txt"));
		}catch(Exception e){JOptionPane.showMessageDialog(null, "File is not found!");}
	}
}
