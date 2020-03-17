package gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.GUIUtil;

public class gamePanel extends JPanel{

	static {
		GUIUtil.useLNF();
	}
	public static gamePanel instance = new gamePanel();
	
	public gamePanel(){
		this.setLayout(new BorderLayout());
		this.add(north(), BorderLayout.NORTH);
		this.add(south(), BorderLayout.SOUTH);
		this.add(west(), BorderLayout.WEST);
		this.add(east(), BorderLayout.EAST);
		this.add(center(), BorderLayout.CENTER);
	}
	
	
	private JPanel center() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		p.setBackground(Color.red);

		p.setLayout(null);
		JLabel lCard = new JLabel();
		JLabel lNorth = new JLabel();
		JLabel lSouth = new JLabel();
		JLabel lWest = new JLabel();
		JLabel lEast = new JLabel();
		JButton bStart = new JButton("¿ªÊ¼ÓÎÏ·");
		bStart.setBounds(500, 200, 100, 50);
		bStart.setBackground(Color.red);
		
		lCard.setBounds(250, 150, 100, 200);
		lCard.setBorder(BorderFactory.createLineBorder(Color.blue));
		lNorth.setBounds(120, 30, 40, 40);
		lNorth.setBorder(BorderFactory.createLineBorder(Color.red));
		lSouth.setBounds(620, 470, 40, 40);
		lSouth.setBorder(BorderFactory.createLineBorder(Color.red));
		lEast.setBounds(710, 30, 40, 40);
		lEast.setBorder(BorderFactory.createLineBorder(Color.red));
		lWest.setBounds(50, 470, 40, 40);
		lWest.setBorder(BorderFactory.createLineBorder(Color.red));
		
		p.add(lCard);
		p.add(bStart);
		p.add(lNorth);
		p.add(lSouth);
		p.add(lEast);
		p.add(lWest);
		return p;
	}


	private JPanel east() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(10, 1));
		GUIUtil.setLabel(p, 2);
		return p;
	}


	private JPanel west() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(10,1));
		GUIUtil.setLabel(p, 2);
		return p;
	}


	private JPanel south() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		GUIUtil.setLabel(p, 1);
		return p;
	}


	private JPanel north() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		GUIUtil.setLabel(p, 1);
		return p;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GUIUtil.showPanel(gamePanel.instance);
	}

}
