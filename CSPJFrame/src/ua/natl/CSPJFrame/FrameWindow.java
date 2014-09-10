package ua.natl.CSPJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameWindow extends JFrame {
	
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a, b;
	
	public FrameWindow(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Clear");
		b2 = new JButton("Calculate");
		l1 = new JLabel("Enter Your first number:");
		l2 = new JLabel("Enter Your second number:");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(b1);
		add(b2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
	}
}