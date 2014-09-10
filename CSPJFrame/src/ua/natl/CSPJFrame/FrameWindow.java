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
	eHandler hanler = new eHandler();
	
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
		b2.addActionListener(hanler);
		b1.addActionListener(hanler);
	}
	
	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent ev){
			try{
				if(ev.getSource()==b2){
					i = Integer.parseInt(t1.getText());
					k = Integer.parseInt(t2.getText());
					i *= 100;
					k *= 100;
					a = "Now Your first number = " + i;
					b = "Now Your second number = " + k;
					l3.setText(a);
					l4.setText(b);
				}
				
				if(ev.getSource()==b1){
					t1.setText(null);
					t2.setText(null);
					l3.setText("");
					l4.setText("");
				}
			}catch(Exception e){JOptionPane.showMessageDialog(null, "Enter a NUMBER!");}	
		}
	}
}