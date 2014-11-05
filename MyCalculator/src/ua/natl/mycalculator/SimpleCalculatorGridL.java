package ua.natl.mycalculator;

import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;

public class SimpleCalculatorGridL {

	public static void main(String[] args) {
		
		JPanel windowContent = new JPanel();	
		GridLayout gl = new GridLayout(4, 2);
		windowContent.setLayout(gl);
		
		JLabel label1 = new JLabel("Number 1: ");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2: ");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum: ");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
		
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
		JFrame frame = new JFrame("My Calculator");
		frame.setContentPane(windowContent);
		frame.setSize(400, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}
}