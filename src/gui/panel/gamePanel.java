package gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
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
		p.setLayout(null);
		JLabel l = new JLabel();
		l.setBounds(350, 150, 100, 200);
		l.setBorder(BorderFactory.createLineBorder(Color.red));
		p.add(l);
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
