package util;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import card.*;
import gui.panel.gamePanel;

public class gameUtil {

	public static void setCard(JLabel l, card c, boolean flag) {
		if(flag == true) {
			if(c instanceof numberCard) {
				int number = ((numberCard) c).number;
				l.setText("" + number);
				l.setHorizontalAlignment(SwingConstants.CENTER);
			}
			if(c instanceof reverseCard) {
				l.setText("·´×ª");
				l.setHorizontalAlignment(SwingConstants.CENTER);
			}
			if(c instanceof addTwoCard) {
				l.setText("+2");
				l.setHorizontalAlignment(SwingConstants.CENTER);
			}
			if(c instanceof forbidCard) {
				l.setText("½ûÖ¹");
				l.setHorizontalAlignment(SwingConstants.CENTER);
			}
			
			l.setFont(new Font("ËÎÌå", 1, 20));
			l.setOpaque(true);
			
			switch(c.color) {
		    case "red":
			    l.setBackground(Color.RED);
			    break;
		    case "yellow":
			    l.setBackground(Color.YELLOW);
			    break;
		    case "green":
			    l.setBackground(Color.GREEN);
			    break;
		    case "blue":
			    l.setBackground(Color.BLUE);
			    break;	
			}
		}else if(flag == false) {
			l.setOpaque(true);
			l.setBackground(Color.BLACK);
		}

		
		
	}
	
	public static card selectCard(ArrayList<card> deck) {
		int size = deck.size() - 1;
		int number = (int) (Math.random() * size);
		card temp = deck.get(number);
		deck.remove(number);
		return temp;
	}
	
	public static void showTurn(JLabel l) {
		l.setOpaque(true);
		l.setBackground(Color.RED);
	}
	
	public static void selectTurn(int turn) {
		if(turn == 1) {
			showTurn(gamePanel.instance.lSouth);
		}else if(turn == 2) {
			showTurn(gamePanel.instance.lEast);
		}else if(turn == 3) {
			showTurn(gamePanel.instance.lNorth);
		}else if(turn == 4) {
			showTurn(gamePanel.instance.lWest);
		}
	}
	
	public static void disCard(JLabel l) {
		
	}
}
