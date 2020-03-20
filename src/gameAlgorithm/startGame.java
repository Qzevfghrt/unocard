package gameAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;

import card.addTwoCard;
import card.card;
import card.forbidCard;
import card.numberCard;
import card.reverseCard;
import gui.panel.*;
import util.gameUtil;

public class startGame {

	public static ArrayList<card> deck = new ArrayList();
    public static ArrayList<card> recordSouth = new ArrayList();
    public static ArrayList<card> recordEast = new ArrayList();
    public static ArrayList<card> recordNorth = new ArrayList();
    public static ArrayList<card> recordWest = new ArrayList();
	
    public static HashMap<JLabel, card> record = new HashMap<>(); 
    
    public static int turn = 1;
    
    //≥ı ºªØ≈∆ø‚
	public static void shuffleCard() {
		String colorSelect[] = new String[]{"red", "blue", "yellow", "green"};
			
		for(int i = 0; i < 4; i++) {
			
			deck.add(new numberCard(0, colorSelect[i]));
			
			for(int j = 1; j <= 9; j++) {	
				for(int k = 0; k < 2; k++) {
					deck.add(new numberCard(j, colorSelect[i]));
				}
			}
			
			for(int j = 0; j < 2; j++) {
				deck.add(new forbidCard(colorSelect[i]));
			}
			
			for(int j = 0; j < 2; j++) {
				deck.add(new addTwoCard(colorSelect[i]));
			}
			
			for(int j = 0; j < 2; j++) {
				deck.add(new reverseCard(colorSelect[i]));
			}
		}	
		
	}
	
	//∑¢≈∆
	public static void dealCards() {
		
		for(int i = 0; i < 6; i++) {
			JLabel l = gamePanel.instance.southLabel[i];
			card c = gameUtil.selectCard(deck);
			recordSouth.add(c);
			record.put(l, c);
			gameUtil.setCard(l, c, true);
		}
		
		for(int i = 0; i < 6; i++) {
			JLabel l = gamePanel.instance.eastLabel[i];
			card c = gameUtil.selectCard(deck);
			recordEast.add(c);
			record.put(l, c);
			gameUtil.setCard(l, c, false);
		}
		
		for(int i = 0; i < 6; i++) {
			JLabel l = gamePanel.instance.northLabel[i];
			card c = gameUtil.selectCard(deck);
			recordNorth.add(c);
			record.put(l, c);
			gameUtil.setCard(l, c, false);
		}
		
		for(int i = 0; i < 6; i++) {
			JLabel l = gamePanel.instance.westLabel[i];
			card c = gameUtil.selectCard(deck);
			recordEast.add(c);
			record.put(l, c);
			gameUtil.setCard(l, c, false);
		}
		
		gameUtil.selectTurn(turn);
	}
	


	public static void main(String[] args) {
		
	}
}
