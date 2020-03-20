package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gameAlgorithm.startGame;

public class startGameListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		startGame.shuffleCard();
		startGame.dealCards();
		
	}

}
