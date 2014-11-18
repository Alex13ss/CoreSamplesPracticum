package ua.natl.mycalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculator {

	JPanel windowContent;
	JFormattedTextField displayField;
	JButton[] button = new JButton[10];
	JButton buttonPoint;
	JButton buttonEqual;
	JPanel p1;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonMul;
	JButton buttonDiv;
	JButton buttonClr;
	JButton buttonXZ;
	
	Calculator() {
		
		windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		
		displayField = new JFormattedTextField();
		displayField.setPreferredSize(new Dimension(250, 25));
		displayField.setHorizontalAlignment(SwingConstants.RIGHT);
		windowContent.add("North", displayField);
		for (int i = 0; i < 10; i++) {
			button[i] = new JButton("" + i);
		}
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		
		p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);
		for (int i = 1; i <= 10; i++)
			if (i == 10) {
				p1.add(button[0]);
			} else {
				p1.add(button[i]);
			}
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		windowContent.add("Center", p1);
		
		JPanel p2 = new JPanel();
		GridLayout glP2 = new GridLayout(4, 1);
		p2.setLayout(glP2);
		buttonPlus = new JButton("+");
		p2.add(buttonPlus);
		buttonMinus = new JButton("-");
		p2.add(buttonMinus);
		buttonMul = new JButton("*");
		p2.add(buttonMul);
		buttonDiv = new JButton("/");
		p2.add(buttonDiv);
		windowContent.add("East", p2);
		
		JPanel p3 = new JPanel();
		GridLayout glP3 = new GridLayout(2, 1);
		p3.setLayout(glP3);
		buttonClr = new JButton("Clr");
		p3.add(buttonClr);
		buttonXZ = new JButton("XZ");
		p3.add(buttonXZ);
		windowContent.add("West", p3);
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		CalculatorEngine calcEngine = new CalculatorEngine(this);
		for (int i = 0; i < 10; i++) {
			button[i].addActionListener(calcEngine);
		}
		buttonPoint.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
		buttonPlus.addActionListener(calcEngine);
		buttonMinus.addActionListener(calcEngine);
		buttonMul.addActionListener(calcEngine);
		buttonDiv.addActionListener(calcEngine);
		buttonClr.addActionListener(calcEngine);
		
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
	
}