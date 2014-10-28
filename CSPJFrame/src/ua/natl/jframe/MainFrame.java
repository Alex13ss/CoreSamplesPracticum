package ua.natl.jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
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
		
		JButton b = new JButton("Go-go-go");
		b.setBackground(Color.YELLOW);
		
		contentPane.add(p, BorderLayout.NORTH);
		contentPane.add(b, BorderLayout.WEST);
		contentPane.add(new JTextField("Hello"), BorderLayout.SOUTH);
		contentPane.add(new JTextArea("JJJJJ"), BorderLayout.CENTER);
		
	}
}