package gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.frame.MainFrame;
import gui.listener.singleGameListener;
import util.GUIUtil;

public class startPanel extends JPanel{

	public static startPanel instance = new startPanel();
	
	public JLabel l = new JLabel();

	public JButton bSingle = new JButton("单人游戏");
	public JButton bDouble = new JButton("多人对战");
	
	
	public startPanel() {
		this.setLayout(new BorderLayout());
		this.add(north(), BorderLayout.NORTH);
		this.add(south(), BorderLayout.CENTER);
		addListener();
	}
	
	private JPanel north() {
		JPanel p = new JPanel();
		GUIUtil.setImageIcon(l, "uno.jpg");
		p.add(l);
		return p;
	}
	
	private JPanel south() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout());
		bSingle.setFont(new java.awt.Font("SimSun", 1, 40));
		bSingle.setBackground(Color.red);
		bDouble.setFont(new java.awt.Font("SimSun", 1, 40));
		bDouble.setBackground(Color.red);
		p.add(bSingle);
		p.add(bDouble);
		return p;
	}
	
	public void addListener() {
		singleGameListener l = new singleGameListener();
		bSingle.addActionListener(l);
	}
	
	public static void main(String[] args) {
		GUIUtil.showPanel(startPanel.instance);
	}
	
}
