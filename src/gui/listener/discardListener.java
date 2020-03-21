package gui.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import gameAlgorithm.gameRules;
import gameThread.gameThread;
import gui.panel.gamePanel;
import util.gameUtil;

public class discardListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel l = (JLabel) e.getSource();
		gameUtil.disCard(l);
		gameUtil.adjustCard(gamePanel.instance.southLabel);
		
		int turn = 2;
		int order = 1;
		while(turn != 1) {

			gameRules.basicRule(turn, order);

			
			if(order == 1) {
				turn = turn % 4 + 1;
			}else if(order == 2) {
				turn = (turn + 3) % 4;
				if(turn == 0)
					turn = 4;
			}
			gameUtil.selectTurn(turn);
			
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
}
