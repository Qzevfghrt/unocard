package gui.frame;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public static MainFrame instance = new MainFrame();
	
	private MainFrame(){
		this.setSize(1000, 800);
		this.setTitle("UNO Card");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance.setVisible(true);
		
	}

}
