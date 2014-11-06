package ua.natl.mycalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CalculatorEngine implements ActionListener {
	
	Calculator parent;
	public CalculatorEngine(Calculator parent) {
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clickedButton = (JButton)e.getSource();
		String dispFieldText = parent.displayField.getText();
		String clickedButtonLabel = clickedButton.getText();
		parent.displayField.setText(dispFieldText + clickedButtonLabel);

	}

}