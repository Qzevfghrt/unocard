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
		flag = true;
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
	
	public static void closeTurn(JLabel l1, JLabel l2, JLabel l3) {
		l1.setOpaque(false);
		l2.setOpaque(false);
		l3.setOpaque(false);
		l1.setBackground(Color.WHITE);
		l2.setBackground(Color.WHITE);
		l3.setBackground(Color.WHITE);
	}
	
	public static void selectTurn(int turn) {
		if(turn == 1) {
			showTurn(gamePanel.instance.lSouth);
			closeTurn(gamePanel.instance.lEast, gamePanel.instance.lNorth, gamePanel.instance.lWest);
		}else if(turn == 2) {
			showTurn(gamePanel.instance.lEast);
			closeTurn(gamePanel.instance.lSouth, gamePanel.instance.lNorth, gamePanel.instance.lWest);
		}else if(turn == 3) {
			showTurn(gamePanel.instance.lNorth);
			closeTurn(gamePanel.instance.lSouth, gamePanel.instance.lEast, gamePanel.instance.lWest);
		}else if(turn == 4) {
			showTurn(gamePanel.instance.lWest);
			closeTurn(gamePanel.instance.lEast, gamePanel.instance.lNorth, gamePanel.instance.lSouth);
		}
		
	}
	
	//出牌
	public static void disCard(JLabel l) {
		if(startGame.record.containsKey(l)) {
			card c = startGame.record.get(l);
			startGame.record.remove(l);
			resetCard(l);
			
			gameUtil.setCard(gamePanel.instance.lCard, c, true);
			startGame.record.put(gamePanel.instance.lCard, c);
		}
	}
	
	//调整牌序
	public static void adjustCard(JLabel[] l) {
		boolean flag = false;
		if(Arrays.equals(l, gamePanel.instance.southLabel)) {
			flag = true;
		}

		int count = 0;
		for(int i = 0; i < 10; i++) {
			if(startGame.record.containsKey(l[i]))
				count++;
		}
		for(int i = 0; i < 10; i++) {
			if(!startGame.record.containsKey(l[i])) {

				for(int j = i; j < count; j++) {

					card c = startGame.record.get(l[j + 1]);
					startGame.record.put(l[j], c);
					setCard(l[j], c, flag);
				}
				
				break;
			}
		}
		startGame.record.remove(l[count]);
		resetCard(l[count]);
	}
	

	public static boolean isEmpty(JLabel[] l) {
		int length = 0;
		for(int i = 0; i < 10; i++) {
			if(startGame.record.containsKey(l[i])) {
				length++;
			}
		}
		if(length == 0) {
			return true;
		}else {
			return false;
		}
	}
	

	
	public static boolean isColorEqual(card c) {
		card lcard;
		if(startGame.record.containsKey(gamePanel.instance.lCard)) {
		    lcard = startGame.record.get(gamePanel.instance.lCard);
		}else {
			return false;
		}
		
		if(c.color != lcard.color) {
			return false;
		}
		return true;
	}
	
	public static JLabel findEmpty(JLabel[] l) {
		for(int i = 0; i < 10; i++) {
			if(!startGame.record.containsKey(l[i])) {
				return l[i];
			}
		}
		return null;
		
	}
	

	
}
