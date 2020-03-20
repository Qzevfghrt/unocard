package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.panel.gamePanel;
import gui.panel.startPanel;
import util.GUIUtil;

public class singleGameListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		startPanel p = startPanel.instance;
		GUIUtil.showPanel(gamePanel.instance);
	}

	
}
