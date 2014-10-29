package ua.natl.jframe;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

public class ButtonAction extends AbstractAction {

	private static final long serialVersionUID = 2880722715224889037L;
	
	

	public ButtonAction(String name, Icon icon) {
		super(name, icon);
		// TODO Auto-generated constructor stub
	}



	public ButtonAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("button clicked");
		
	}
}