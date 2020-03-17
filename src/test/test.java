package test;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("uno");
		f.setBounds(200, 200, 1000, 800);
		JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("d:/software/project/unocard/img/uno.jpg");
		l.setBounds(50, 50, 500, 400);
		l.setIcon(i);
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
