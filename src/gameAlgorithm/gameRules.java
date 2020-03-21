package gameAlgorithm;

import javax.swing.JLabel;

import card.card;
import gameThread.gameThread;
import gui.panel.gamePanel;
import util.gameUtil;

public class gameRules {
	
	public static int turn = 2;
	public static int order = 1;
	
	//出牌是否合理
	public static boolean isRight(JLabel[] l) {
		for(int i = 0; i < 10; i++) {
			if(!startGame.record.containsKey(l[i])) {
				return false;
			}
			card c = startGame.record.get(l[i]);
			if(gameUtil.isColorEqual(c) == true) {
				gameUtil.disCard(l[i]);
				gameUtil.adjustCard(l);
				return true;
			}
		}
		return false;
	}
	
	public static void basicRule(int turn, int order) {
		
		
		boolean flag = true;
		if(turn == 2) {

			flag = isRight(gamePanel.instance.eastLabel);
			if(flag == false) {
				card c = gameUtil.selectCard(startGame.deck);
				JLabel l = gameUtil.findEmpty(gamePanel.instance.eastLabel);
				startGame.record.remove(l);
				startGame.record.put(l, c);
				gameUtil.setCard(l, c, flag);
			}
		}else if(turn == 3) {

			flag = isRight(gamePanel.instance.northLabel);
			if(flag == false) {
				card c = gameUtil.selectCard(startGame.deck);
				JLabel l = gameUtil.findEmpty(gamePanel.instance.northLabel);
				startGame.record.remove(l);
				startGame.record.put(l, c);
				gameUtil.setCard(l, c, flag);
			}
		}else if(turn == 4) {

			flag = isRight(gamePanel.instance.westLabel);
			if(flag == false) {
				card c = gameUtil.selectCard(startGame.deck);
				JLabel l = gameUtil.findEmpty(gamePanel.instance.westLabel);
				startGame.record.remove(l);
				startGame.record.put(l, c);
				gameUtil.setCard(l, c, flag);
			}
		}
		
		
	}
}
