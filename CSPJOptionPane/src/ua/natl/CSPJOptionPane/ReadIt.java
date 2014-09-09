package ua.natl.CSPJOptionPane;

import javax.swing.JOptionPane;

public class ReadIt {
	int i,k;
	String n1, n2;
	
	public void Scan(){
		n1 = JOptionPane.showInputDialog("Enter first number: ");
		n2 = JOptionPane.showInputDialog("Enter second number: ");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);	
	}
	
	public void Scan(int a, int b){
		JOptionPane.showMessageDialog(null, "Now Your first number = " + a);
		JOptionPane.showMessageDialog(null, "Now Your second number = " + b);
	}
}