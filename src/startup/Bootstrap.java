package startup;

import javax.swing.SwingUtilities;

import gui.frame.MainFrame;
import gui.panel.startPanel;
import util.GUIUtil;

public class Bootstrap {

	public static void main(String[] args) throws Exception{
		SwingUtilities.invokeAndWait(new Runnable() {
			public void run() {
				GUIUtil.showPanel(startPanel.instance);			
			}
		});
	}
}
