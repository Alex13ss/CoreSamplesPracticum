package ua.natl.jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	/**
	 * Created by Alex on October 28, 2014 (22:00)
	 * All rights are reserved.
	 * xD
	 */
	private static final long serialVersionUID = 1L;
	private JTextField t;
	private JTextArea a;

	public static void main(String[] args) {

		new MainFrame();

	}

	public MainFrame() throws HeadlessException {
		super();
		setTitle("Hello");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBackground(Color.GREEN);
		//setPreferredSize(new Dimension(500, 400));
		setSize(500, 400);
		setLocationRelativeTo(null);
		addComponents(getContentPane());
		//pack();
		setVisible(true);
	}

	private void addComponents(Container contentPane) {
		contentPane.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		
		final ButtonAction action = new ButtonAction("Click me!");
		
		JButton b = new JButton(action);
		b.setBackground(Color.YELLOW);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
				a.setText(t.getText());
				a.setBackground(new Color(255, 155, 10));
				System.out.println(e.getSource());
			}
		});
		
		t = new JTextField("Hello");
		a = new JTextArea("JJJJJ");
		contentPane.add(p, BorderLayout.NORTH);
		contentPane.add(b, BorderLayout.WEST);
		contentPane.add(t, BorderLayout.SOUTH);
		contentPane.add(a, BorderLayout.CENTER);
		
		a.addPropertyChangeListener("background", new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {

				System.out.println(String.format("Old: %s, New: %s.", 
						evt.getOldValue(), evt.getNewValue()));
				action.setEnabled(false);
			}
		});
		
		contentPane.add(new JButton(action), BorderLayout.EAST);
		
	}
}