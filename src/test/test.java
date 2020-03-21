package test;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("uno");
		f.setBounds(200, 200, 1000, 800);
		JLabel l = new JLabel();

		l.setBounds(50, 50, 200, 400);

		l.setBorder(BorderFactory.createLineBorder(Color.black));
		l.setOpaque(true);
		l.setBackground(Color.RED);

		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
