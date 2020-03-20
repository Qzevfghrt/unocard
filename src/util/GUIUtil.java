package util;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.frame.MainFrame;
import gui.panel.gamePanel;

public class GUIUtil {

	private static String imageFolder = "d:/software/project/unocard/img";
	
	public static void setImageIcon(JLabel l, String fileName) {
		ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
		l.setIcon(i);
	}
	
	public static void showPanel(JPanel p) {
		MainFrame.instance.setContentPane(p);
		MainFrame.instance.setVisible(true);
	}
	
	public static void setLabel(JPanel p, int flag, JLabel label[]) {
		for(int i = 0; i < 10; i++) {
			JLabel l = new JLabel("");
			if(flag == 1)
			    l.setPreferredSize(new Dimension(50, 100));
			else 
				l.setPreferredSize(new Dimension(100, 50));
			l.setBorder(BorderFactory.createLineBorder(Color.blue));
			label[i] = l;
			p.add(l);
		}

	}
	
	public static void useLNF() {
		try {
			javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
