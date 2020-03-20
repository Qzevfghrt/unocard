package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gameAlgorithm.startGame;
import gui.panel.gamePanel;
import util.gameUtil;

public class startGameListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		gameUtil.resetCard(gamePanel.instance.lCard);
		startGame.shuffleCard();
		startGame.dealCards();
	}

}
