package ua.natl.myfirstapplet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyFirstApplet extends Applet {
	
	public void paint(Graphics graphics) {
		
		graphics.drawString("Hello Applet World!", 70, 40);
		
	}

}