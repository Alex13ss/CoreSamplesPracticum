package ua.natl.tttapplet;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends Applet implements ActionListener {
	
	Button squares[];
	Button newGameButton;
	Label score;
	int emptysquaresLeft = 9;
	
	// наступний метод - це конструктор апплета
	public void init() {
		
		this.setLayout(new BorderLayout());
		this.setBackground(Color.ORANGE);
		this.setSize(350, 400);
		// м≥н€Їмо шрифт
		Font appletFont = new Font("Monospased", Font.BOLD, 20);
		this.setFont(appletFont);
		
		newGameButton = new Button("New Game");
		newGameButton.addActionListener(this);
		
		Panel topPanel = new Panel();
		topPanel.add(newGameButton);
		this.add(topPanel, "North");
		
		Panel centerPanel = new Panel();
		centerPanel.setLayout(new GridLayout(3, 3));
		this.add(centerPanel, "Center");
		
		score = new Label("Your turn!");
		this.add(score, "South");
		
		// ≥гров≥ 9 кнопок запакуЇмо у масив
		squares = new Button[9];
		for (int i = 0; i < 9; i++) {
			squares[i] = new Button();
			squares[i].addActionListener(this);
			squares[i].setBackground(Color.GREEN);
			centerPanel.add(squares[i]);
		}
		
	}
	
	// аступний метод - дл€ обробки под≥й
	public void actionPerformed(ActionEvent e) {
		
		Button theButton = (Button)e.getSource();
		
		if (theButton == newGameButton) {
			for (int i = 0; i < 9; i++) {
				squares[i].setEnabled(true);
				squares[i].setLabel("");
				squares[i].setBackground(Color.GREEN);
			}
			emptysquaresLeft = 9;
			score.setText("Your turn!");
			newGameButton.setEnabled(false);
			return;
		}
		
		String winner = "";
		for (int i = 0; i < 9; i++) {
			if (theButton == squares[i]) {
				squares[i].setLabel("X");
				winner = lookForWinner();
				if (!"".equals(winner)) {
					endTheGame();
				} else {
					computerMove();
					winner = lookForWinner();
					if (!"".equals(winner)) {
						endTheGame();
					}
				}
				break;
			}
		}
		
		if (winner.equals("X")) {
			score.setText("You won!");
		} else if (winner.equals("O")) {
			score.setText("You lost!");
		} else if (winner.equals("T")) {
			score.setText("It's a tie!");
		}
		
	}
	
	// дал≥ - шукаЇмо переможц€, п≥сл€ кожного ходу...
	String lookForWinner() {
		
		String theWinner = "";
		emptysquaresLeft--;
		
		if (emptysquaresLeft == 0) {
			return "T"; // перев≥рку на н≥чию варто робити в≥дразу
		}
		
		// шукаЇмо л≥н≥ю з 3-х одинакових знак≥в
		if (!squares[0].getLabel().equals("") 
				&& squares[0].getLabel().equals(squares[1].getLabel())
				&& squares[0].getLabel().equals(squares[2].getLabel())) {
			theWinner = squares[0].getLabel();
			highlightWinner(0, 1, 2);
		} else if (!squares[3].getLabel().equals("") 
				&& squares[3].getLabel().equals(squares[4].getLabel())
				&& squares[3].getLabel().equals(squares[5].getLabel())) {
			theWinner = squares[3].getLabel();
			highlightWinner(3, 4, 5);
		} else if (!squares[6].getLabel().equals("") 
				&& squares[6].getLabel().equals(squares[7].getLabel())
				&& squares[6].getLabel().equals(squares[8].getLabel())) {
			theWinner = squares[6].getLabel();
			highlightWinner(6, 7, 8);
		} else if (!squares[0].getLabel().equals("") 
				&& squares[0].getLabel().equals(squares[3].getLabel())
				&& squares[0].getLabel().equals(squares[6].getLabel())) {
			theWinner = squares[0].getLabel();
			highlightWinner(0, 3, 6);
		} else if (!squares[1].getLabel().equals("") 
				&& squares[1].getLabel().equals(squares[4].getLabel())
				&& squares[1].getLabel().equals(squares[7].getLabel())) {
			theWinner = squares[1].getLabel();
			highlightWinner(1, 4, 7);
		} else if (!squares[2].getLabel().equals("") 
				&& squares[2].getLabel().equals(squares[5].getLabel())
				&& squares[2].getLabel().equals(squares[8].getLabel())) {
			theWinner = squares[2].getLabel();
			highlightWinner(2, 5, 8);
		} else if (!squares[0].getLabel().equals("") 
				&& squares[0].getLabel().equals(squares[4].getLabel())
				&& squares[0].getLabel().equals(squares[8].getLabel())) {
			theWinner = squares[0].getLabel();
			highlightWinner(0, 4, 8);
		} else if (!squares[2].getLabel().equals("") 
				&& squares[2].getLabel().equals(squares[4].getLabel())
				&& squares[2].getLabel().equals(squares[6].getLabel())) {
			theWinner = squares[2].getLabel();
			highlightWinner(2, 4, 6);
		}
		
		return theWinner;
		
	}
	
	// розпов≥даЇмо компу про елементарну лог≥ку гри
	void computerMove() {
		
		int selectedSquare;
		selectedSquare = findEmptySquare("O");
		if (selectedSquare == -1) {
			selectedSquare = findEmptySquare("X");
		}
		if ((selectedSquare == -1) && (squares[4].getLabel().equals(""))) {
			selectedSquare = 4;
		}
		if (selectedSquare == -1) {
			selectedSquare = getRandomSquare();
		}
		squares[selectedSquare].setLabel("O");
		
	}
	
	// нудна ≥нструкц≥€, €к шукати дв≥ кл≥тинки з одинаковими знаками
	int findEmptySquare(String player) {
		
		int weight[] = new int[9];
		
		for (int i = 0; i < 9; i++) {
			if (squares[i].getLabel().equals("O")) {
				weight[i] = -1;
			} else if (squares[i].getLabel().equals("X")) {
				weight[i] = 1;
			} else {
				weight[i] = 0;
			}
		}
		
		int twoWeights = player.equals("O") ? -2 : 2;
		
		if (weight[0] + weight[1] + weight[2] == twoWeights) {
			if (weight[0] == 0) {
				return 0;
			} else if (weight[1] == 0) {
				return 1;
			} else {
				return 2;
			}
		}
		
		if (weight[3] + weight[4] + weight[5] == twoWeights) {
			if (weight[3] == 0) {
				return 3;
			} else if (weight[4] == 0) {
				return 4;
			} else {
				return 5;
			}
		}
		
		if (weight[6] + weight[7] + weight[8] == twoWeights) {
			if (weight[6] == 0) {
				return 6;
			} else if (weight[7] == 0) {
				return 7;
			} else {
				return 8;
			}
		}
		
		if (weight[0] + weight[3] + weight[6] == twoWeights) {
			if (weight[0] == 0) {
				return 0;
			} else if (weight[3] == 0) {
				return 3;
			} else {
				return 6;
			}
		}
		
		if (weight[1] + weight[4] + weight[7] == twoWeights) {
			if (weight[1] == 0) {
				return 1;
			} else if (weight[4] == 0) {
				return 4;
			} else {
				return 7;
			}
		}
		
		if (weight[2] + weight[5] + weight[8] == twoWeights) {
			if (weight[2] == 0) {
				return 2;
			} else if (weight[5] == 0) {
				return 5;
			} else {
				return 8;
			}
		}
		
		if (weight[0] + weight[4] + weight[8] == twoWeights) {
			if (weight[0] == 0) {
				return 0;
			} else if (weight[4] == 0) {
				return 4;
			} else {
				return 8;
			}
		}
		
		if (weight[2] + weight[4] + weight[6] == twoWeights) {
			if (weight[2] == 0) {
				return 2;
			} else if (weight[4] == 0) {
				return 4;
			} else {
				return 6;
			}
		}
		
		return -1;
		
	}
	
	// коли компу нучого не залишаЇтьс€...
	int getRandomSquare() {
		
		boolean gotEmptySquare = false;
		int selectedSquare = -1;
		
		do {
			selectedSquare = (int)(Math.random() * 9);
			if (squares[selectedSquare].getLabel().equals("")) {
				gotEmptySquare = true;
			}
		} while (!gotEmptySquare);
		
		return selectedSquare;
		
	}
	
	// вид≥лимо jackpot-комб≥нац≥ю
	void highlightWinner(int win1, int win2, int win3) {
		
		squares[win1].setBackground(Color.CYAN);
		squares[win2].setBackground(Color.CYAN);
		squares[win3].setBackground(Color.CYAN);
		
	}
	
	// повторимо?!
	void endTheGame() {
		newGameButton.setEnabled(true);
		for (int i = 0; i < 9; i++) {
			squares[i].setEnabled(false);
		}
	}

}