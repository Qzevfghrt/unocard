package util;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import card.*;
import gameAlgorithm.startGame;
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
				l.setText("反转");
				l.setHorizontalAlignment(SwingConstants.CENTER);
			}
			if(c instanceof addTwoCard) {
				l.setText("+2");
				l.setHorizontalAlignment(SwingConstants.CENTER);
			}
			if(c instanceof forbidCard) {
				l.setText("禁止");
				l.setHorizontalAlignment(SwingConstants.CENTER);
			}
			
			l.setFont(new Font("宋体", 1, 20));
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
	
	public static void resetCard(JLabel l) {
		l.setOpaque(false);
		l.setText("");
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
	
	//出牌
	public static void disCard(JLabel l) {
		if(startGame.record.containsKey(l)) {
			card c = startGame.record.get(l);
			startGame.record.remove(l);
			resetCard(l);
			gameUtil.setCard(gamePanel.instance.lCard, c, true);
		}
	}
	
	//调整牌序
	public static void adjustCard(JLabel[] l) {
		boolean flag = false;
		if(Arrays.equals(l, gamePanel.instance.southLabel)) {
			flag = true;
		}

		int count = 0;
		card temp[] = new card[10];
		for(int i = 0; i < 10; i++) {
			if(startGame.record.containsKey(l[i])) {

				temp[count++] = startGame.record.get(l[i]);
			}
		}
		for(int i = 0; i < count; i++) {
			setCard(l[i], temp[i], flag);
		}
		resetCard(l[count]);
	}
	

}
