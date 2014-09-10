package ua.natl.CSPJFrame;

import javax.swing.JFrame;

public class FrameMain {

	public static void main(String[] args) {
		
		FrameWindow w = new FrameWindow("2 digit mod.");
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(300, 200);
		w.setResizable(false);
		w.setLocationRelativeTo(null);

	}
}