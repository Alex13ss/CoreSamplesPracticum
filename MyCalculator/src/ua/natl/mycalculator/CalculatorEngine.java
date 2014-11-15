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
			try {
				displayValue = Double.parseDouble(dispFieldText);
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Enter a NUMBER!!!", "Bad idea...", 2);
				return;
			}
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
				if (displayValue == 0) {
					JOptionPane.showMessageDialog(null, "You can't divide by zero!", "Shit happens...", 2);
				} else {
					currentResault /= displayValue;
					parent.displayField.setText("" + currentResault);
				}
			} else if (selectedAction == '*') {
				currentResault *= displayValue;
				parent.displayField.setText("" + currentResault);
			}
		} else if (src == parent.buttonClr) {
			selectedAction = ' ';
			currentResault = 0;
			displayValue = 0;
			parent.displayField.setText("");
		} else if (src == parent.buttonPoint) {
			if (dispFieldText.isEmpty()) {
				parent.displayField.setText("0.");
			} else if (dispFieldText.indexOf('.', 0) > 0) {
				JOptionPane.showMessageDialog(null, "I can't accept one more dot!", "Not so fast!", 2);
			} else {
				parent.displayField.setText(dispFieldText + ".");
			}
		} else {
			String clickedButtonLabel = clickedButton.getText();
			parent.displayField.setText(dispFieldText + clickedButtonLabel);
		} 
		
	}

}