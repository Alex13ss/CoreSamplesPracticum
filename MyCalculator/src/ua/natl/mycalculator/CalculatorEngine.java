package ua.natl.mycalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CalculatorEngine implements ActionListener {
	
	Calculator parent;
	char selectedAction = ' ';
	double currentResault = 0;
	CalculatorEngine(Calculator parent) {
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clickedButton = (JButton)e.getSource();
		String dispFieldText = parent.displayField.getText();
		double displayValue = 0;
		if (!"".equals(dispFieldText)) {
			displayValue = Double.parseDouble(dispFieldText);
		}
		
		Object src = e.getSource();
		
		if (src == parent.buttonPlus) {
			selectedAction = '+';
			currentResault = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonMinus) {
			selectedAction = '-';
			currentResault = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonDiv) {
			selectedAction = '/';
			currentResault = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonMul) {
			selectedAction = '*';
			currentResault = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonEqual) {
			if (selectedAction == '+') {
				currentResault += displayValue;
				parent.displayField.setText("" + currentResault);
			} else if (selectedAction == '-') {
				currentResault -= displayValue;
				parent.displayField.setText("" + currentResault);
			} else if (selectedAction == '/') {
				currentResault /= displayValue;
				parent.displayField.setText("" + currentResault);
			} else if (selectedAction == '*') {
				currentResault *= displayValue;
				parent.displayField.setText("" + currentResault);
			}
		} else {
			String clickedButtonLabel = clickedButton.getText();
			parent.displayField.setText(dispFieldText + clickedButtonLabel);
		}
		
	}

}